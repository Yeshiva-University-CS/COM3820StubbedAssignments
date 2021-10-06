package edu.yu.parallel;

/** Implements Matrix "add" and "multiply" using the JDK 7 "fork/join"
 * framework to implement a "divide-and-conquer" approach.
 *
 * @author Avraham Leff
 */

import java.util.concurrent.ExecutionException;

public class JDKFJMatrixOps implements MatrixOps {

  public JDKFJMatrixOps() {
    // ForkJoinPool ivar initialized at declaration point
  }

  @Override
  public double[][] add(final double[][] a, final double[][] b)
    throws InterruptedException, ExecutionException
  {
      return null;
  }
  
  @Override
  public double[][] multiply(final double[][] a, final double[][] b) 
    throws InterruptedException, ExecutionException
  {
      return null;
  }

} // JDKFJMatrixOps

