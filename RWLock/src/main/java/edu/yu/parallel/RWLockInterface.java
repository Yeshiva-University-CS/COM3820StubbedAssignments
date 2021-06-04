package edu.yu.parallel;

/* Defines a "read/write lock" interface.  It allows multiple threads to lock
 * in read mode concurrently, but only one thread is allowed to lock in write
 * mode concurrently.
 *
 * Motivation: multiple threads can read from a shared resource without causing
 * concurrency errors.  Concurrency errors only occur when either reads and
 * writes or if multiple writes take place concurrently.
 *
 * The locking rules are as follows.  A thread invoking lockRead() is granted
 * the lock iff no other thread has currently locked the resource for writing.
 * A thread invoking lockWrite() is granted the lock iff no other thread
 * currently has acquired the lock (in either write or read mode)
 *
 *
 * @author Avraham Leff 
 */

public interface RWLockInterface {

  /** Acquires the lock iff no other thread currently has acquired the lock in
   * write mode.  Otherwise, invoking thread is blocked until the writing
   * thread releases the lock.
   *
   * NOTE: blocking threads are queued in the order that they requested the lock
   */
  public void lockRead();

  /** Acquires the lock iff no other thread currently has acquired the lock in
   * either read or write mode.  Otherwise, invoking thread is blocked until
   * all reading threads release the lock.  
   *
   * NOTE: blocking threads are queued in the order that they requested the lock
   */
  public void lockWrite();

  /** Releases the lock if currently owned by the invoking thread.
   *
   * @throws IllegalArgumentException if invoking thread doesn't currently own
   * the lock.
   */
  public void unlock();

} // interface
