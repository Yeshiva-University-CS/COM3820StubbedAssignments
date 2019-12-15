package edu.yu.parallel;

/** Implements Matrix "add" and "multiply" using the JDK 7 "fork/join" APIs.
 *
 * @author Avraham Leff
 */

public class JDKFJMatrixOps {

  public JDKFJMatrixOps() {
  }

  /** Adds matrices a and b.
   *
   * @param a Represents a "matrix"
   * @param b Represents a "matrix"
   * @param threshold matrices whose dimensions are less than equal to
   * the threshold will be processed with a serial algorithm, must be
   * greater than 0
   * @return The result of adding the two matrices.
   */
  public double[][] add(final double[][] a, final double[][] b,
                        final int threshold)
  {
      return new double[0][0];
  }
  
  /** Multiplies matrices a and b.
   *
   * @param a Represents a "matrix"
   * @param b Represents a "matrix"
   * @param addThreshold matrices whose dimensions are less than equal
   * to the threshold will have matrix addition operations processed
   * with a serial algorithm, must be greater than 0.  (Note: matrix
   * multiplication performs matrix addition in the course of a
   * divide-and-conquer algorithm.)
   * @param multiplyThreshold matrices whose dimensions are less than
   * equal to the threshold will have matrix multiplication operations
   * processed with a serial algorithm, must be greater than 0
   * @return The result of multiplying the two matrices.
   */
  public double[][] multiply(final double[][] a, final double[][] b,
                             final int addThreshold,
                             final int multiplyThreshold)
  {
      return new double[0][0];
  }
} // JDKFJMatrixOps
