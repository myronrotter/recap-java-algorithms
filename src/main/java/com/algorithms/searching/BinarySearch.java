package com.algorithms.searching;

import com.algorithms.interfaces.Searching;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Searching algorithm: BinarySearch.
 */
public class BinarySearch implements Searching {

  @Override
  public <T extends Comparable<T>> int search(T[] arr, T key) {
    if (arr == null || arr.length == 0) {
      return -1;
    } else if (!SortingUtils.isSorted(arr)) {
      throw new IllegalArgumentException("Input array is not sorted.");
    }

    return this.recSearch(arr, key, 0, arr.length - 1);
  }

  /**
   * Function for recursive implementation of BinarySearch.
   *
   * @param <T>   Type must support comparison via the Comparable interface.
   * @param arr   Array to be searched.
   * @param key   The key to be searched for.
   * @param left  Index of lower boundary.
   * @param right Index of upper boundary.
   * @return Index of the key if it exists otherwise -1.
   */
  private <T extends Comparable<T>> int recSearch(T[] arr, T key, int left, int right) {
    int middle = (left + right) / 2;

    if (right >= left) {
      if (CompareUtils.equalTo(arr[middle], key)) {
        return middle;
      } else if (CompareUtils.lessThan(key, arr[middle])) {
        return this.recSearch(arr, key, left, middle - 1);
      } else {
        return this.recSearch(arr, key, middle + 1, right);
      }
    }

    return -1;
  }

  @Override
  public int find(Integer[] arr, Integer key) {
    return this.search(arr, key);
  }
}
