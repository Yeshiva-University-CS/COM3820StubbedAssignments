package edu.yu.parallel;

/** Defines an interface for finding "long tracks" in a list of albums, where
 * "long" is defined as "greater than 60 seconds".
 */

import java.util.List;
import java.util.Set;

public interface LongTrackFinderInterface {
  /** Returns the names of "long" tracks.
   *
   * @param albums the list of albums to search
   * @return set of the track names that qualify, may be empty, can't be null.
   */
  public Set<String> findLongTracks(List<Album> albums);
} // interface
