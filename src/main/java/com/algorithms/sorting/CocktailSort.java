package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: CocktailSort. Improves BubbleSort by solving the - turtle
 * - problem. Nevertheless it does not improve asymptotic performance.
 */
public class CocktailSort implements Sorting {

  @Override
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    if (arr == null || arr.length == 0) {
      return arr;
    }

    // Initialize swapped, if swapped false after forward and backward iteration,
    // array is sorted
    boolean swapped = true;
    // Initialize left and right boundary
    int left = 0;
    int right = arr.length - 1;

    while (swapped) {
      // Reset swapped to false
      swapped = false;
      // From left to right
      for (int i = left; i < right; i++) {
        if (CompareUtils.lessThan(arr[i + 1], arr[i])) {
          SortingUtils.swap(arr, i, i + 1);
          // Set swapped to true
          swapped = true;
        }
      }
      // Lower right boundary
      right--;

      // If nothing swapped after iteration from left to right, array is sorted
      if (!swapped)
        break;

      // Reset swapped from last iteration
      swapped = false;
      // From right to left
      for (int i = right; i > left; i--) {
        if (CompareUtils.lessThan(arr[i], arr[i - 1])) {
          SortingUtils.swap(arr, i, i - 1);
          swapped = true;
        }
      }
      // Increment left boundary
      left++;
    }

    return arr;
  }
}
