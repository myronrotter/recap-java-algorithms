package com.algorithms.utils;

/**
 * Utility class for mathematical implementations.
 */
public class MathUtils {

  /**
   * Maximum of x and y.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param x
   * @param y
   * @return Maximum of x and y.
   */
  public static <T extends Comparable<T>> T max(T x, T y) {
    return CompareUtils.lessThan(x, y) ? y : x;
  }

  /**
   * Find the maximum of the array.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to find maximum.
   * @return Maximum of the array.
   */
  public static <T extends Comparable<T>> T findMax(T[] arr) {
    if (arr.length == 0 || arr == null) {
      throw new IllegalArgumentException("Array null or empty.");
    }

    T max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      max = MathUtils.max(arr[i], max);
    }
    return max;
  }

  /**
   * Absolute value of x.
   *
   * @param x Integer.
   * @return Absolute value of x.
   */
  public static int absolute(int x) {
    return x < 0 ? -x : x;
  }

}
