package edu.yu.parallel;

/** Interface for a small subset of the classic JDK Map interface.
 * Implementations of this Map do not support null values.
 *
 * @author Avraham Leff
 */

public interface BabyMap<K, V> {

  /** Associates the specified value with the specified key in this map.
   *
   * Javadoc for jdk.util.Map#put is controlling authority for method semantics.
   */
  V put(K key, V value);

  /** Removes the mapping for a key from this map if it is present.
   *
   * Javadoc for jdk.util.Map#remove is controlling authority for method semantics.
   */
  V remove(Object key);

  /** Returns the value to which the specified key is mapped, or null if this
   * map contains no mapping for the key.
   *
   * Javadoc for jdk.util.Map#get is controlling authority for method
   * semantics.
   */
  V get(Object key);
}
