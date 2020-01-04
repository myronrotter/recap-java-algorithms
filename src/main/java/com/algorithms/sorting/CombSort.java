package com.algorithms.sorting;

import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: CombSort. Improves BubbleSort by eliminating - turtles -
 * (relative small values at the end of the array). Ignoring - rabbits -
 * (relative large values at the end of the array).
 */
public class CombSort {

  /**
   * Sorting array via CombSort algorithm.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to be sorted.
   * @return Sorted array.
   */
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    // Initialize gap with array size
    int gap = arr.length;
    // Standard shrik factor is 1.3
    double shrink = 1.3;
    boolean sorted = false;

    while (!sorted) {
      gap = (int) Math.floor(gap / shrink);
      if (gap <= 1) {
        // If gap < 1
        gap = 1;
        // Array is sorted if no further swaps occur
        sorted = true;
      }

      // Perform gaped-bubblesort
      for (int i = 0; i + gap < arr.length; i++) {
        if (CompareUtils.greaterThan(arr[i], arr[i + gap])) {
          SortingUtils.swap(arr, i, i + gap);
          // If gap = 1 and no swaps occur, arr is sorted
          sorted = false;
        }
      }
    }

    return arr;
  }

}
