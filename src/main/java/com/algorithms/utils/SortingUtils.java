package com.algorithms.utils;

/**
 * Utility class for sorting algorithms.
 */
public class SortingUtils {
  /**
   * Swaps positions of two elements within an array.
   *
   * @param <T>       Type must support comparison via the Comparable interface.
   * @param arr       Array where elements should be swapped.
   * @param positionX Position of one element.
   * @param positionY Position of other element.
   */
  public static <T extends Comparable<T>> void swap(T[] arr, int positionX, int positionY) {
    T value = arr[positionX];
    arr[positionX] = arr[positionY];
    arr[positionY] = value;
  }

  /**
   * Checks if an array is sorted.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to check.
   * @return True, iff array is sorted.
   */
  public static <T extends Comparable<T>> boolean isSorted(T[] arr) {
    boolean sorted = true;
    for (int i = 0; i < arr.length - 1; i++) {
      if (CompareUtils.greaterThan(arr[i], arr[i + 1])) {
        sorted = false;
        break;
      }
    }
    return sorted;
  }

  /**
   * Checks if an array is sorted.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to check.
   * @return True, iff array is sorted.
   */
  public static <T extends Comparable<T>> boolean isSorted2D(T[][] arr) {
    boolean sorted = true;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr[i].length - 1; j++) {
        if (CompareUtils.greaterThan(arr[i][j], arr[i][j + 1])) {
          sorted = false;
          break;
        }
      }
    }

    int k;
    for (int i = 0; i < arr.length; i++) {
      if (i < arr.length - 1) {
        k = i + 1;
      } else {
        break;
      }
      for (int j = 0; j < arr[i].length; j++) {
        if (CompareUtils.greaterThan(arr[i][j], arr[k][0])) {
          sorted = false;
          break;
        }
      }
    }
    return sorted;
  }

  /**
   * Flip array within range @param left and @param right.
   *
   * @param <T>   Type must support comparison via the Comparable interface.
   * @param arr   Array to be flipped.
   * @param left  Index left boundary.
   * @param right Index right boundary.
   */
  public static <T extends Comparable<T>> void flip(T[] arr, int left, int right) {
    while (left <= right) {
      swap(arr, left, right);
      left++;
      right--;
    }
  }
}
