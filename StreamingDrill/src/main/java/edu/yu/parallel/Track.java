package edu.yu.parallel;

/** Models an element from the "music" sample domain used in this drill.  You
 * may not modify the existing constructor or set of methods: you may choose to
 * override toString().
 *
 * For this assignment ONLY, my tests will not require you to override equals
 * and hashCode().
 *
 */

public final class Track {
    
  private final String name;
  private final int length;

  public Track(String name, int length) {
    this.name = name;
    this.length = length;
  }

  public String getName() {
    return name;
  }

  /**
   * @return the length of the track in milliseconds.
   */
  public int getLength() {
    return length;
  }
}
