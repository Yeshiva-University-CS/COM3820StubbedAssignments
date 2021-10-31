package edu.yu.parallel;

/** Defines the interface for the StreamingDrill assignment: see the
 * requirements doc for more information.
 *
 * @author Avraham Leff
 */

import java.util.List;

public interface StreamingDrillInterface {

  /** Returns the "name" and "nationality" of the artists: the returned list
   * contains a sequence of alternating "artist", "artist_nationality"
   * elements.
   *
   * IMPORTANT: your implementation MUST be correct AND use a "pure, internal,
   * functional style".
   * 
   * @see Artist.getName
   * @see Artist.getNationality
   */
  public List<String> getNamesAndNationalities(List<Artist> artists);

  /** Returns a List of albums that have at most three three tracks.
   *
   * IMPORTANT: your implementation MUST be correct AND use a "pure, internal,
   * functional style".
   *
   * @see Album.getTrackList
   */
  public List<Album> albumsWithAtMostThreeTracks(List<Album> input);

  /** Returns the number of band members from the input list of artists.
   *
   * IMPORTANT: your implementation MUST be correct AND use a "pure, internal,
   * functional style".
   *
   * @see Artist.getMembers
   */
  public int countBandMembers(List<Artist> artists);  
} // interface
