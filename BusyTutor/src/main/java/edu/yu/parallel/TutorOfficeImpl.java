package edu.yu.parallel;

/** Extends TutorOffice to implement a thread-safe and performant driver
 * program in which a Tutor interacts with multiple Student instance such that
 * the the constraints and invariants of the BusyTutor requirements document
 * are maintained.
 *
 * Students must implement the task methods that are not implemented in the
 * base class.  Students are free to add whatever state and methods they feel
 * are needed for the implementation.
 * 
 * @author Avraham Leff
 */


public class TutorOfficeImpl extends TutorOffice {
  public TutorOfficeImpl() {
    // your code goes here
  }

  @Override
  public Void startTutoringService() {
    // your code goes here
    return null;
  }

  @Override
  public Void newStudentTask() {
    // your code goes here
    return null;
  }
}
