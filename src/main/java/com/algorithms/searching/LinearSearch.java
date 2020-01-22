package com.algorithms.searching;

import com.algorithms.interfaces.Searching;
import com.algorithms.utils.CompareUtils;

/**
 * Searching algorithm: LinearSearch.
 */
public class LinearSearch implements Searching {

  @Override
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

  @Override
  public int find(Integer[] arr, Integer key) {
    return this.search(arr, key);
  }
}
