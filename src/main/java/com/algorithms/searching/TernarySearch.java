package com.algorithms.searching;

import com.algorithms.interfaces.Searching;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Searching algorithm: BinarySearch.
 */
public class TernarySearch implements Searching {

  @Override
  public <T extends Comparable<T>> int search(T[] arr, T key) {
    if (!SortingUtils.isSorted(arr)) {
      throw new IllegalArgumentException("Input array is not sorted.");
    }

    return this.recSearch(arr, key, 0, arr.length - 1);
  }

  /**
   * Function for recursive implementation of TernarySearch.
   *
   * @param <T>   Type must support comparison via the Comparable interface.
   * @param arr   Array to be searched.
   * @param key   The key to be searched for.
   * @param left  Index of lower boundary.
   * @param right Index of upper boundary.
   * @return Index of the key if it exists otherwise -1.
   */
  private <T extends Comparable<T>> int recSearch(T[] arr, T key, int left, int right) {
    // Find new thirds
    int oneThird = left + (int) (right - left) / 3;
    int twoThird = right - (int) (right - left) / 3;

    if (right >= left) {
      // Check if key is one of the thirds
      if (CompareUtils.equalTo(arr[oneThird], key)) {
        return oneThird;
      } else if (CompareUtils.equalTo(arr[twoThird], key)) {
        return twoThird;
      } else if (CompareUtils.lessThan(key, arr[oneThird])) {
        // Key may exists between left and oneThird
        return recSearch(arr, key, left, --oneThird);
      } else if (CompareUtils.greaterThan(key, arr[twoThird])) {
        // Key may exists between twoThird and right
        return recSearch(arr, key, ++twoThird, right);
      } else {
        // Key may exists between oneThird and twoThird
        return recSearch(arr, key, ++oneThird, --twoThird);
      }
    }

    return -1;
  }

  @Override
  public int find(Integer[] arr, Integer key) {
    return this.search(arr, key);
  }
}
