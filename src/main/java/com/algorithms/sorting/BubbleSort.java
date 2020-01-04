package com.algorithms.sorting;

import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: BubbleSort.
 */
public class BubbleSort {

  /**
   * Sorting array via BubbleSort algorithm.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to be sorted.
   * @return Sorted array.
   */
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (CompareUtils.greaterThan(arr[j], arr[j + 1])) {
          SortingUtils.swap(arr, j, j + 1);
        }
      }
    }

    return arr;
  }

}
