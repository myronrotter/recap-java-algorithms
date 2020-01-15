package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: GnomeSort.
 */
public class GnomeSort implements Sorting {

  @Override
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    int i = 1;

    while (i < arr.length) {
      if (i == 0 || CompareUtils.lessThan(arr[i - 1], arr[i]) || CompareUtils.equalTo(arr[i - 1], arr[i])) {
        i++;
      } else {
        SortingUtils.swap(arr, i, i - 1);
        i--;
      }
    }

    return arr;
  }

}
