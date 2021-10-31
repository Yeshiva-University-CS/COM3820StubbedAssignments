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
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public final class Artist {
    
  private final String name;
  private final List<Artist> members;
  private final String nationality;
    
  public Artist(String name, String nationality) {
    this(name, Collections.emptyList(), nationality);
  }

  public Artist(String name, List<Artist> members, String nationality) {
    Objects.requireNonNull(name);
    Objects.requireNonNull(members);
    Objects.requireNonNull(nationality);
    this.name = name;
    this.members = new ArrayList<>(members);
    this.nationality = nationality;
  }

  public String getName() {
    return name;
  }

  public Stream<Artist> getMembers() {
    return members.stream();
  }

  public String getNationality() {
    return nationality;
  }

}
