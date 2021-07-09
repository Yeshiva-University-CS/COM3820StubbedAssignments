package edu.yu.parallel;

/** A Tutor instance (NOT a Tutor task)
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


public final class Tutor {

  public Tutor() {
    id = counter.incrementAndGet();
  }

  @Override
  public String toString() { return "Tutor #"+id; }

  public void teachStudent() {
    logger.info("Tutor {}: teaching Student", id);
    thresholdMonitor.aboutToTutorStudent();
    
    try {
      Thread.sleep(PER_STUDENT_STUDY_TIME_MS);
      thresholdMonitor.finishedTutoringStudent();
    }
    catch(Exception e) {
      logger.error("Tutor's learning interrupted, exiting ...", e);
    }
  }

  private final static Logger logger = LogManager.getLogger(Tutor.class);
  private final static AtomicLong counter = new AtomicLong();
  private final long id;

}
