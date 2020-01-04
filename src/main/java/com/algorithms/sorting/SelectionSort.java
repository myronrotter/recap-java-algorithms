package com.algorithms.sorting;

import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: SelectionSort.
 */
public class SelectionSort {

  /**
   * Sorting array via SelectionSort algorithm.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to be sorted.
   * @return Sorted array.
   */
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    int position;

    for (int i = 0; i < arr.length; i++) {
      position = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (CompareUtils.lessThan(arr[j], arr[position])) {
          position = j;
        }
      }
      if (position != i) {
        SortingUtils.swap(arr, i, position);
      }
    }

    return arr;
  }

}
