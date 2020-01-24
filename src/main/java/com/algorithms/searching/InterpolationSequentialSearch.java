package com.algorithms.searching;

import com.algorithms.interfaces.Finding;
import com.algorithms.utils.SortingUtils;

/**
 * Searching algorithm: InterpolationSearch.
 */
public class InterpolationSequentialSearch implements Finding {

  @Override
  public int find(Integer[] arr, Integer key) {
    if (arr == null || arr.length == 0) {
      return -1;
    } else if (!SortingUtils.isSorted(arr)) {
      throw new IllegalArgumentException("Input array is not sorted.");
    }

    // Initialize left and right boundaries
    int left = 0;
    int right = arr.length - 1;
    // Interpolate index once
    int index = left + (int) ((right - left) * ((double) (key - arr[left]) / (arr[right] - arr[left])));

    if (index < left || index > right) {
      return -1;
    } else if (key == arr[index]) {
      return index;
    } else if (key > arr[index]) {
      left = ++index;
    } else {
      right = --index;
    }

    // Perform linearsearch
    for (int i = left; i <= right; i++) {
      if (arr[i] == key) {
        return i;
      }
    }

    return -1;
  }

}
