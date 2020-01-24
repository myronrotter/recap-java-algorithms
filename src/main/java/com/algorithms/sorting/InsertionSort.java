package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;
import com.algorithms.utils.CompareUtils;

/**
 * Sorting algorithm: InsertionSort.
 */
public class InsertionSort implements Sorting {

  @Override
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    if (arr == null || arr.length == 0) {
      return arr;
    }

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
