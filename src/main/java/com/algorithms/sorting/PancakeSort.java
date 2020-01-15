package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;
import com.algorithms.utils.MathUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: PancakeSort.
 */
public class PancakeSort implements Sorting {

  @Override
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
