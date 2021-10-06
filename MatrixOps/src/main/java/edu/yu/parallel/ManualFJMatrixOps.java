package edu.yu.parallel;

/** Implements Matrix "add" and "multiply" using a "manual divide-and-conquer"
 * (JDK5 ExecutorService) approach.
 *
 * @author Maurice Herlihy
 * @author Avraham Leff
 */

import java.util.concurrent.ExecutionException;

public class ManualFJMatrixOps implements MatrixOps {

  public ManualFJMatrixOps() {
    // ExecutorService ivar initialized at declaration point
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

} // ManualFJMatrixOps

