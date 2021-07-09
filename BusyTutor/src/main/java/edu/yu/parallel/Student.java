package edu.yu.parallel;

/** A Student instance (NOT a student task)
 *
 * Students may not modify this class in any way!
 *
 * @author Avraham Leff
 */

import java.util.concurrent.atomic.AtomicLong;
import static edu.yu.parallel.TutorOffice.PER_STUDENT_STUDY_TIME_MS;
import static edu.yu.parallel.TutorOffice.thresholdMonitor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Student {
  public Student() {
    id = counter.incrementAndGet();
  }

  @Override
  public String toString() { return "Student #"+id; }

  public void enter() {
    logger.info("Student {}: Entering tutor's office", id);
  }

  public void notTurnedAway() {
    logger.info("Student {}: Enough space in office, not turned away", id);
    thresholdMonitor.studentNotTurnedAway();
  }

  
  public void learnFromTutor() {
    logger.info("Student {}: Imbibing wisdom from tutor", id);

    try {
      Thread.sleep(PER_STUDENT_STUDY_TIME_MS);
    }
    catch(Exception e) {
      logger.error("Student had problem sleeping (learning)", e);
    }
  }

  public void leaveAfterLearning() {
    logger.info("Student {}: Leaving tutor's office", id);
    thresholdMonitor.studentLeft(); // reason doesn't matter
  }

  public void leaveBecauseNoRoom() {
    logger.info("Student {}: Leaving tutor's office because no room", id);
  }
  

  private final static Logger logger = LogManager.getLogger(Student.class);
  private final static AtomicLong counter = new AtomicLong();
  private final long id;
}
