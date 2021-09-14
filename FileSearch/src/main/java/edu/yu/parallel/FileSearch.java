package edu.yu.parallel;

/** Defines an interface for "searching for files'
 *
 * @author Avraham Leff
 */

import java.io.File;
import java.util.Objects;

public interface FileSearch {

  // You may not modify the public API or semantics of the Result inner class
  // in any way!  Your choice about overriding methods (so long as they don't
  // change the implied semantics!), or adding INTERNAL methods and state
  static class Result {
    public Result() {
      this(null);
    }

    public Result(final String path) {
      this.path = path;
    }
    
    public boolean isFound() {
      return path != null;
    }

    /** If the file was found, returns an absolute path to that file.
     * Otherwise, returns null.
     */
    public String getPath() {
      return path;
    }

    public void setPath(final String path) {
      this.path = path;
    }

    @Override
    public String toString() {
      return path == null ? "Result: file not found" : getPath();
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) return true;
      if (!(o instanceof Result)) {
        return false;
      }

      final Result that = (Result) o;

      return Objects.equals(this.path, that.path);
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(path);
    }

    private String path;
  }

  /** Starting from the specified initial path, search for a file with the
   * specified file name, and return the status of the search.  The search
   * terminates either when a match is found or when all files have been
   * searched and no match found.
   *
   * Note: a directory with the specified name does not count as a "match".
   *
   * @param initialPath specifies where in the directory tree to begin the
   * search, must be an absolute path.
   * @param searchName the name of the file to search for (must match exactly
   * for the search to terminate)
   * @param result Initially set to a "not found" state, if the file is found,
   * the state is changed to correspond to the appropriate "file found" state.
   * @throw IllegalArgumentException if any of the parameters are null, or if
   * the File doesn't exist, or if the File doesn't correspond to an absolute
   * path, or doesn't correspond to a directory.
   */
  public void searchFiles
    (final File initialPath, final String searchName, final Result result);
}
