package edu.yu.parallel;

/** Monitors violations of the BusyTutor constraints.
 *
 * Thread-safe by design.
 *
 * Students may not modify this code in any way!
 *
 * @author Avraham Leff
 */

import java.util.concurrent.atomic.AtomicInteger;
import static edu.yu.parallel.TutorOffice.MAX_STUDENTS_IN_OFFICE;


final class ThresholdMonitor {
  public ThresholdMonitor() {
  }

  /** Invoked only when a student enters the office, and doesn't immediately
   * leave because no room
   */
  void studentNotTurnedAway() {
    nStudentsInOffice.getAndIncrement();
    final int nStudents = nStudentsInOffice.get();
    if (nStudents > MAX_STUDENTS_IN_OFFICE) {
      final String msg = "There are too many students <"+nStudents+
        "> in the office! ";
      // @fixme(?): asserting that this cannot be recovered from because it's a
      // test method assert
      throw new Error(msg);
    }
  }

  void aboutToTutorStudent() {
    nStudentsBeingTutored.getAndIncrement();
    final int nBeingTutored = nStudentsBeingTutored.get();

    if (nBeingTutored != 1) {
      final String msg = "Something seriously wrong: can only tutor one "+
        "student at a time but there are <"+nBeingTutored+
        "> in the office! ";
      // @fixme(?): asserting that this cannot be recovered from because it's a
      // test method assert
      throw new Error(msg);
    }
  }

  void finishedTutoringStudent() {
    totalStudentsTutored.getAndIncrement();
    nStudentsBeingTutored.getAndDecrement();
  }


  /** Invoked only when a student leaves the office after being tutored.
   */
  void studentLeft() {
    nStudentsInOffice.getAndDecrement();
  }

  @Override
  public String toString() {
    final String msg = "nStudentsInOffice: "+nStudentsInOffice.get()+"\n"+
      "totalStudentsTutored: "+totalStudentsTutored.get();

    return msg;
  }
  
  private final AtomicInteger nStudentsInOffice = new AtomicInteger();
  private final AtomicInteger totalStudentsTutored = new AtomicInteger();
  private final AtomicInteger nStudentsBeingTutored = new AtomicInteger();    
}
