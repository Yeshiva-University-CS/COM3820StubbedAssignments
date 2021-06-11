package edu.yu.parallel;

/*************************************************************
 * IMPORTANT: Students may not modify the class in any way!
 *************************************************************/


/** An abstract base class specification that implementations extend to create
 * threads that can play a Ping-Pong game.
 *
 * Specifically: a game is played by two threads, one thread is a Ping
 * instance, the other is a Pong instance (see enum definition below).  A Ping
 * and Pong thread play together by (respectively) pinging or ponging in
 * response to the other thread (respectively) ponging or pinging.  A game
 * consists of a stream of strictly alternating "ping, pong, ping, pong ..."
 * events, with the game terminated only after each thread has emitted
 * "maxIteration" number of events.  The challenge for the threads is to ensure
 * that a ping or pong is emitted only in response to a prior pong or ping.  We
 * model this by requiring a game thread to ping/or pong only after first
 * "acquiring" permission.  A thread can only acquire permission if the other
 * thread doesn't currently own the permission, typically because it "released"
 * the permission that it previously acquired.  Having acquired the permission,
 * a thread can "emit" a game event.  Because the event stream must consist of
 * strictly alternating events, having emitted the game event, a thread should
 * promptly "release" that permission, so the other thread can, in turn,
 * acquire the permission and emit its event.
 *
 * Instances of concrete Ping/Pong implementations are passed to the Driver
 * class, and a game ensues by invoking Driver.doIt().  It is the responsibilty
 * of a game implementor to ensure that the Ping thread will emit an event
 * before the Pong thread.
 *
 * @author Avraham Leff
 */

import java.util.Objects;
import java.util.Queue;

public abstract class PingPongThread  extends Thread {
  public enum Type {
    PING,
    PONG
  };

  /** Immutable holder class: represents a single "turn" in a Ping-Pong game.
   */
  public final static class Turn {
    public final int iteration;
    public final Type type;

    public Turn (final Type type, final int iteration) {
      assert iteration > 0 : "Iteration must be > 0: "+iteration;
      this.type = type;
      this.iteration = iteration;
    }

    @Override
    public String toString() { return type+"("+iteration+")"; }

    @Override
    // not looking to do a great job, but don't want to pay the cost of
    // auto-boxing "iteration"
    public int hashCode() {
      int hash = 1;
      final int prime = 31;
      hash = (prime * hash) + type.hashCode();
      hash = (prime * hash) + iteration;
      return hash;
    }
    
    @Override
    public boolean equals(final Object o) {
      if (o == this) {
        return true;
      }
      
      if (!(o instanceof Turn)) {
        return false;
      }

      final Turn other = (Turn) o;
      return type == other.type && iteration == other.iteration;
    }
    
  } // Turn 
      


  /** Constructor initializes the various fields.
   *
   * @param type Specifies whether I'm a Ping or a Pong
   * @param maxIterations Number of iterations that the thread will either
   * ping or pong.  Must be a positive integer.
   * @param emitterQueue Used to emit events
   */
  public PingPongThread
    (final Type type, final int maxIterations, final Queue<Turn> emitterQueue)
  {
    Objects.requireNonNull(emitterQueue, "emitterQueue");
    this.emitterQueue = emitterQueue;

    this.type = type;

    if (maxIterations < 1) {
      throw new IllegalArgumentException
        ("'maxIterations' must be > 0: "+maxIterations);
    }
      
    this.maxIterations = maxIterations;
  }

  public final Queue<Turn> getEmitterQueue() {
    return emitterQueue;
  }

  /** Acquire permission to emit an event.
   */
  protected abstract void acquire();

  /** Release permission to the other thread, enabling it to acquire
   * permission.
   */
  protected abstract void release();

  /** Indicate that this thread is done playing ping/pong.
   */
  protected abstract void done();

  /** Emits the event, represented as a Turn instance to the common queue,
   * returns said Turn instance to the client.
   */
  public final Turn emit(final int iteration) {
    // "Inserts the specified element into this queue if it is possible to do
    // so immediately without violating capacity restrictions, returning true
    // upon success and throwing an IllegalStateException if no space is
    // currently available."
    //
    // IMPORTANT: We don't have to worry about "capacity restrictions" because
    // the queue is assumed to be unbounded.
    final Turn turn = new Turn(this.type, iteration);
    emitterQueue.add(turn);
    return turn;
  }

  /** A PingPongThread executes a loop (maxIterations number of times) in which
   * it successively acquires permission, emits an event, and releases the game
   * permission.
   */
  public final void run() {
    for (int loopsDone = 1; loopsDone <= maxIterations; ++loopsDone) {
      // Subclasses are responsible for implementing acquire() and release()
      // correctly
      acquire();
      emit(loopsDone);
      if (loopsDone % 10 == 0) {
        System.out.println(Thread.currentThread()+" emitted "+loopsDone+
                           " "+type+" events");
      }
      release();
    }

    done();
  }

  /**
   * Number of iterations to ping or to pong.
   */
  private final int maxIterations;

  /** Type of the game thread
   */
  protected final Type type;

  /** A queue common to both game threads.
   */
  protected final Queue<Turn> emitterQueue;

} // class

