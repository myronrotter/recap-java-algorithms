package com.algorithms.searching;

import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Searching algorithm: BinarySearch.
 */
public class BinarySearch {

  /**
   * Searching an element within an array via BinarySearch.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to be searched.
   * @param key The key to be searched for.
   * @return Index of key in array or -1.
   */
  public <T extends Comparable<T>> int search(T[] arr, T key) {
    if (!SortingUtils.isSorted(arr)) {
      throw new IllegalArgumentException("Input array is not sorted.");
    }

    return this.find(arr, key, 0, arr.length - 1);
  }

  /**
   * Function for recursive implementation of BinarySearch.
   *
   * @param <T>   Type must support comparison via the Comparable interface.
   * @param arr   Array to be searched.
   * @param key   The key to be searched for.
   * @param left  Index of lower boundary.
   * @param right Index of upper boundary.
   * @return Index of key in array or -1.
   */
  private <T extends Comparable<T>> int find(T[] arr, T key, int left, int right) {
    int middle = (left + right) / 2;

    if (right >= left) {
      if (CompareUtils.equalTo(arr[middle], key)) {
        return middle;
      } else if (CompareUtils.lessThan(key, arr[middle])) {
        return this.find(arr, key, left, middle - 1);
      } else {
        return this.find(arr, key, middle + 1, right);
      }
    }

    return -1;
  }
}
