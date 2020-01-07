package com.algorithms.sorting;

import java.util.Random;

import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: BogoSort.
 */
public class BogoSort {

  private static final Random random = new Random();

  /**
   * Sorting array via BogoSort algorithm.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to be sorted.
   * @return Sorted array.
   */
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    while (!SortingUtils.isSorted(arr)) {
      // Shuffle array randomly
      for (int i = 0; i < arr.length; i++) {
        int index = random.nextInt(arr.length - i) + i;
        SortingUtils.swap(arr, i, index);
      }
    }

    return arr;
  }

}
