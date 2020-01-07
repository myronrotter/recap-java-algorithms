package com.algorithms.searching;

import com.algorithms.utils.CompareUtils;

/**
 * Searching algorithm: LinearSearch.
 */
public class LinearSearch {

  /**
   * Searching an element within an array via LinearSearch.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to be searched.
   * @param key The key to be searched for.
   * @return Index of key in array or -1.
   */
  public <T extends Comparable<T>> int search(T[] arr, T key) {
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      if (CompareUtils.equalTo(arr[i], key)) {
        index = i;
        break;
      }
    }
    return index;
  }
}
