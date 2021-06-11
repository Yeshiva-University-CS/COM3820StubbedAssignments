package edu.yu.parallel;

/** Naive, and incorrect, implementation of PingPongThread.
 *
 * @author Avraham Leff
 */

import java.util.Queue;

public class PingPongWrong extends PingPongThread {

  public PingPongWrong
    (final Type type, final int maxIterations, final Queue<Turn> emitterQueue) {
    super(type, maxIterations, emitterQueue);
  }

  @Override
  public void acquire() {
    // no-op
  }

  @Override
  public void release() {
    // no-op
  }

  @Override
  public void done() {
    // no-op
  }
} // class

