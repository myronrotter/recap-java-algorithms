package com.algorithms.searching;

import com.algorithms.interfaces.Finding;
import com.algorithms.utils.SortingUtils;

/**
 * Searching algorithm: InterpolationSearch.
 */
public class InterpolationSearch implements Finding {

  @Override
  public int find(Integer[] arr, Integer key) {
    if (!SortingUtils.isSorted(arr)) {
      throw new IllegalArgumentException("Input array is not sorted.");
    }

    // Initialize left and right boundaries
    int left = 0;
    int right = arr.length - 1;
    int index;

    // While key is in range of boundaries
    while (key >= arr[left] && key <= arr[right]) {
      // Calculate potential index
      // links + (int)(((double)rechts - links) * (schluessel - daten[links]) /
      // versch);
      index = left + (int) ((right - left) * ((double) (key - arr[left]) / (arr[right] - arr[left])));

      if (key == arr[index]) {
        return index;
      } else if (key > arr[index]) {
        left = ++index;
      } else {
        right = --index;
      }
    }

    return -1;
  }

}
