package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;
import com.algorithms.utils.CompareUtils;

/**
 * Sorting algorithm: ShellSort. It improves InsertionSort. Gap-interleaved
 * arrays are sorted individually.
 */
public class ShellSort implements Sorting {

  @Override
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    T value;
    int j;

    // Gap sequence/ size
    for (int gap = arr.length / 2; gap > 0; gap /= 2) {
      // Perform insertionsort
      for (int i = gap; i < arr.length; i += 1) {
        value = arr[i];

        for (j = i; j >= gap && CompareUtils.greaterThan(arr[j - gap], value); j -= gap) {
          arr[j] = arr[j - gap];
        }

        arr[j] = value;
      }
    }

    return arr;
  }

}
