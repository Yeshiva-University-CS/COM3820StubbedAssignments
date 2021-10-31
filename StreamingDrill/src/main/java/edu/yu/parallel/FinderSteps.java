package edu.yu.parallel;

/** Provides a set of static classes, all implement LongTrackFinderInterface.
 *
 * @author Avraham Leff
 */

import java.util.*;
import static java.util.stream.Collectors.toSet;

public class FinderSteps {

  /** Implementation may only use Java's for-each syntax.
   */
  public static class Step0 implements LongTrackFinderInterface {
    public Set<String> findLongTracks(List<Album> albums) {
	return null;
    }
  } // Step0

  /** Replace the Step0 implementation to remove the Java for-each constructs,
   *  using the Stream API defined on java.util.Collection instead to iterate
   *  over the albums.  However: your implementation MUST use the "business
   *  logic" implementation from Step0 when iterate over the tracks.
   */
  public static class Step1 implements LongTrackFinderInterface {
    public Set<String> findLongTracks(List<Album> albums) {
	return null;
    }
  } // Step1

  /** Improve Step1 to remove the explicit iteration over the tracks in the
   * albums: use Stream APIs instead.
   */
  public static class Step2 implements LongTrackFinderInterface {
    public Set<String> findLongTracks(List<Album> albums) {
	return null;
    }
  } // Step2

  /** Improve Step2 to remove the "pyramid of doom": i.e., use functional
   * transformations such as flatMap or map to remove all vestiges of a "nested
   * for-loop".
   */
  public static class Step3 implements LongTrackFinderInterface {
    public Set<String> findLongTracks(List<Album> albums) {
	return null;
    }
  } // Step3

  /** Improve Step3 to NOT declare a SINGLE variable: pure functional, not even
   * local variables!
   */
  public static class Step4 implements LongTrackFinderInterface {
    public Set<String> findLongTracks(List<Album> albums) {
	return null;
    }
  } // Step4


} // FinderSteps
