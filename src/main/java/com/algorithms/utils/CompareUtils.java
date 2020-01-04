package com.algorithms.utils;

/**
 * Utility class for Comparable interface.
 */
public class CompareUtils {

  /**
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param x
   * @param y
   * @return true, iff x > y.
   */
  public static <T extends Comparable<T>> boolean greaterThan(T x, T y) {
    return x.compareTo(y) > 0;
  }

  /**
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param x
   * @param y
   * @return true, iff x < y.
   */
  public static <T extends Comparable<T>> boolean lessThan(T x, T y) {
    return x.compareTo(y) < 0;
  }

  /**
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param x
   * @param y
   * @return true, iff x == y.
   */
  public static <T extends Comparable<T>> boolean equalTo(T x, T y) {
    return x.compareTo(y) == 0;
  }

}
