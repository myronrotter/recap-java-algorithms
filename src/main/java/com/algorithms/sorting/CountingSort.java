package com.algorithms.sorting;

import java.util.Map;
import java.util.TreeMap;

/**
 * Sorting algorithm: CountingSort.
 */
public class CountingSort {

  /**
   * Sorting array via CountingSort algorithm.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to be sorted.
   * @return Sorted array.
   */
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    Map<T, Integer> count = new TreeMap<>();

    // Calculating frequency of unique elements in arr
    for (int i = 0; i < arr.length; i++) {
      count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
    }

    // Construct sorted array by iterating over frequencies
    int k = 0;
    for (Map.Entry<T, Integer> entry : count.entrySet()) {
      for (int j = 0; j < entry.getValue(); j++) {
        arr[k] = entry.getKey();
        k++;
      }
    }

    return arr;
  }

}
