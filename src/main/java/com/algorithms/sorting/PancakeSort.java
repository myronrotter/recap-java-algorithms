package com.algorithms.sorting;

import com.algorithms.utils.MathUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: PancakeSort.
 */
public class PancakeSort {

  /**
   * Sorting array via PancakeSort algorithm.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to be sorted.
   * @return Sorted array.
   */
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    for (int i = arr.length - 1; i > 0; i--) {
      int maxIndex = MathUtils.findMaxIndexInRange(arr, i + 1);

      if (i != maxIndex) {
        SortingUtils.flip(arr, 0, maxIndex);
        SortingUtils.flip(arr, 0, i);
      }
    }

    return arr;
  }

}
