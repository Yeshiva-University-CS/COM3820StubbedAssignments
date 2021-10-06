package edu.yu.parallel;

/** Interface that defines matrix "add" and "multiply" operations.
 *
 * @author Avraham Leff
 */

import java.util.concurrent.ExecutionException;

public interface MatrixOps {

  /** Adds matrices a and b.  Clients are responsible for ensuring
   * that appropriate values for the threshold system properties are
   * set (defined below) before invoking this method.  The
   * implementation is responsible for accessing and using these
   * properties.
   *
   * @param a Represents a "matrix"
   * @param b Represents a "matrix"
   * @return the results of adding the two matrices.
   * @throws InterruptedException if interrupted
   * @throws ExecutionException if execution goes wrong
   */
  public double[][] add(final double[][] a, final double[][] b)
    throws InterruptedException, ExecutionException;

  /** Multiplies matrices a and b.  Clients are responsible for
   * ensuring that appropriate values for the threshold system
   * properties are set (defined below) before invoking this method.
   * set (defined below) before invoking this method.  The
   * implementation is responsible for accessing and using these
   * properties.
   *
   * @param a Represents a "matrix"
   * @param b Represents a "matrix"
   * @return the results of multipling the two matrices.
   * @throws InterruptedException if interrupted
   * @throws ExecutionException if execution goes wrong
   */
  public double[][] multiply(final double[][] a, final double[][] b)
    throws InterruptedException, ExecutionException;

  /** System property that specifies the threshold at which a
   * Fork-Join (whether "manual" or not) implementation of multiply
   * should switch over to a serial implementation.
   */
  public final static String multiplyThreshold = "edu.yu.parallel.multiply.threshold";

  /** System property that specifies the threshold at which a
   * Fork-Join (whether "manual" or not) implementation of add should
   * switch over to a serial implementation.
   */
  public final static String addThreshold = "edu.yu.parallel.add.threshold";
  
}
