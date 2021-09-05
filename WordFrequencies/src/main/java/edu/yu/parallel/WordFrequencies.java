package edu.yu.parallel;

/** Specifies an interface for the "Word Frequencies" problem.
 *
 * @author Avraham Leff
 */

import java.io.IOException;
import java.util.*;

public interface WordFrequencies {

  /** Processes the specified file and determines the frequencies of each word
   * in the file.  
   *
   * When the method completes, clients are guaranteed that all accessor
   * methods may be invoked safely and correctly.  Clients are allowed to
   * invoke this method multiple times on the same instance.
   *
   * @param fileName an absolute path to the file to be processed
   * @throws IOException if any problems reading the file
   */
  public void doIt(final String fileName) throws IOException;

  /** Returns a map whose keys are words in the supplied file, and whose values
   * are the frequency of that word in the file.  
   *
   * Method performance must be less than O(m) where "m" is the number of
   * unique words in the file.
   *
   * @return the map
   */
  public Map<String, Integer> getWordFrequencies();

  /** Returns a set of words (may be empty) that appear exactly once in the
   * supplied file.
   *
   * Method performance must be less than O(m) where "m" is the number of
   * unique words in the file.
   *
   * @return the set
   */
  public Set<String> wordsWithExactlyOneOccurrence();

  /** Returns the set of words that have the maximum frequency over all word
   * frequencies in the supplied file.
   *
   * Method performance must be less than O(m) where "m" is the number of
   * unique words in the file.
   *
   * @return the set
   */
  public Set<String> wordsWithMaxOccurrence();

  /** Returns the maximum word frequency over all words in the supplied file
   *
   * Method performance must be less than O(m) where "m" is the number of
   * unique words in the file.
   *
   * @return maximum frequency
   */
  public int maxWordFrequency();


}
