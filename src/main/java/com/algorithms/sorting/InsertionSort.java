package com.algorithms.sorting;

import com.algorithms.utils.CompareUtils;

/**
 * Sorting algorithm: InsertionSort.
 */
public class InsertionSort {

  /**
   * Sorting array via InsertionSort algorithm.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to be sorted.
   * @return Sorted array.
   */
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    T value;
    int j;

    for (int i = 1; i < arr.length; i++) {
      value = arr[i];

      for (j = i; j > 0 && CompareUtils.greaterThan(arr[j - 1], value); j--) {
        arr[j] = arr[j - 1];
      }

      arr[j] = value;
    }

    return arr;
  }

}
