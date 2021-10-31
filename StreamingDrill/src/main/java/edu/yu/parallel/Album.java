package edu.yu.parallel;

/** Models an element from the "music" sample domain used in this drill.  You
 * may not modify the existing constructor or set of methods: you may choose to
 * override toString().
 *
 * For this assignment ONLY, my tests will not require you to override equals
 * and hashCode().
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.Collections.unmodifiableList;

public final class Album {
    
  private final String name;
  private final List<Track> tracks;
  private final List<Artist> musicians;

  public Album(String name, List<Track> tracks, List<Artist> musicians) {
    Objects.requireNonNull(name);
    Objects.requireNonNull(tracks);
    Objects.requireNonNull(musicians);

    this.name = name;
    this.tracks = new ArrayList<>(tracks);
    this.musicians = new ArrayList<>(musicians);
  }

  public String getName() {
    return name;
  }

  public Stream<Track> getTracks() {
    return tracks.stream();
  }

  /** For imperative-style code.
   */
  public List<Track> getTrackList() {
    return unmodifiableList(tracks);
  }

}
