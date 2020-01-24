package com.algorithms.searching;

import com.algorithms.interfaces.Searching;
import com.algorithms.utils.CompareUtils;

/**
 * Searching algorithm: LinearSearch.
 */
public class LinearSearch implements Searching {

  @Override
  public <T extends Comparable<T>> int search(T[] arr, T key) {
    if (arr == null || arr.length == 0) {
      return -1;
    }

    for (int i = 0; i < arr.length; i++) {
      if (CompareUtils.equalTo(arr[i], key)) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public int find(Integer[] arr, Integer key) {
    return this.search(arr, key);
  }
}
