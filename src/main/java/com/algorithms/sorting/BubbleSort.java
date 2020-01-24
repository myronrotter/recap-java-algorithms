package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: BubbleSort.
 */
public class BubbleSort implements Sorting {

  @Override
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    if (arr == null || arr.length == 0) {
      return arr;
    }

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
