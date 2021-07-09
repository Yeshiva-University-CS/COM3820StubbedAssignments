package edu.yu.parallel;

/** Driver program: implements interactions between Tutor and Students,
 * ensuring that the constraints and invariants specified by the BusyTutor
 * requirements document are maintained.
 *
 *
 * Students may not change the variables or methods of this class in any way.
 * They should only "extend" it in a class named TutorOfficeImpl.

 * @author Avraham Leff
 */

public class TutorOffice {

  public TutorOffice() {
    super();
  }

  /** Encapsulates the task processing that the tutor follows.
   *
   * Students may not change the signature of this method!
   *
   * The implementation must enter a (conceptually) "loop forever" processing
   * in which a single Tutor is ready to respond to Student requests for
   * tutoring.  Implementation code must "somewhere" invoke
   * tutor.teachStudent() on a single Tutor instance.  This instance is
   * available as a service for any number of students (via newStudentTask()
   * below) to access.
   *
   * The implementation must provide the invariants and semantics specified in
   * the requirements doc.
   *
   * The implementation MUST handle an interrupt as a request to exit the
   * processing loop and return from the method.
   */
   public Void startTutoringService() {

     /***

     tutor.teachStudent();

     ***/

    return null;
  }

  /** Encapsulates the task processing that a student wishing to be tutored
   * must follow.
   *
   *
   * Students may not change the signature of this method!
   *
   * Implementation code must "somewhere" invoke the student "lifecycle"
   * methods on a Student instance (see Student API and see comments below).
   *
   * The implementation must provide the invariants and semantics specified in
   * the requirements doc.
   */
  public Void newStudentTask() {

    /****

    Student student = new Student();

    // Student enters, but may be turned away because of lack of space in
    // office
    student.enter();

    // If turned away ...
    student.leaveBecauseNoRoom();

    // Student not turned away

    // Student may be able to get a tutoring session without waiting, may have
    // to wait in the office while another student is tutored

    student.notTurnedAway();

    student.learnFromTutor();

    student.leaveAfterLearning();
    ***/
    
    return null;
  }

  public final static long PER_STUDENT_STUDY_TIME_MS = 100L;
  public final static int MAX_STUDENTS_IN_OFFICE = 4;
  public final static ThresholdMonitor thresholdMonitor =
    new ThresholdMonitor();
}
