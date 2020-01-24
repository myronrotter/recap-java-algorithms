package com.algorithms.sorting;

import java.util.Random;

import com.algorithms.interfaces.Sorting;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: BogoSort.
 */
public class BogoSort implements Sorting {

  private static final Random random = new Random();

  @Override
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    if (arr == null || arr.length == 0) {
      return arr;
    }

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
