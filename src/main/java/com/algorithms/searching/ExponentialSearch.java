package com.algorithms.searching;

import java.util.Arrays;

import com.algorithms.interfaces.Searching;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Searching algorithm: ExponentialSearch.
 */
public class ExponentialSearch implements Searching {

  @Override
  public <T extends Comparable<T>> int search(T[] arr, T key) {
    if (arr == null || arr.length == 0) {
      return -1;
    } else if (!SortingUtils.isSorted(arr)) {
      throw new IllegalArgumentException("Input array is not sorted.");
    } else if (CompareUtils.equalTo(arr[0], key)) {
      return 0;
    } else {
      // Find nearest power of two >= key
      int i = 1;
      while (i < arr.length && (CompareUtils.lessThan(arr[i], key) || CompareUtils.equalTo(arr[i], key))) {
        i = i * 2;
      }

      // Do binarysearch
      int index = Arrays.binarySearch(arr, i / 2, Math.min(i, arr.length), key);
      if (index < 0) {
        return -1;
      } else {
        return index;
      }
    }
  }

  @Override
  public int find(Integer[] arr, Integer key) {
    return this.search(arr, key);
  }
}
