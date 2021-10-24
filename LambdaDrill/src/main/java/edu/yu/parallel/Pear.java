package edu.yu.parallel;

/** Immutable Pear.
 *
 * IMPORTANT: Students may not change the enum, add another constructor, modify
 * the getters, nor may they change the immutable semantics of this class.
 *
 * IMPORTANT: Considering how this class will be used, students may want to ADD
 * methods to this implementation.
 */

public class Pear {

  public  enum Color {
    RED, GREEN, YELLOW
  }

  
  // Students may NOT add any other constructor
  public Pear(final int weight, final Color color) {
    this.weight = weight;
    this.color = color;
  }


  public int getWeight() { return weight; }
  public Color getColor() { return color; }

  // @SuppressWarnings("boxing")
  @Override
  public String toString() {
    return String.format("Pear{color=%s, weight=%d}", color, weight);
  }

  private final int weight;
  private final Color color;
}
