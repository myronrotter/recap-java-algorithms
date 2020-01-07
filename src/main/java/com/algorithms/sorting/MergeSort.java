package com.algorithms.sorting;

import com.algorithms.utils.CompareUtils;

/**
 * Sorting algorithm: MergeSort. Uses divide and conquer.
 */
public class MergeSort {

  /**
   * Sorting array via MergeSort algorithm.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to be sorted.
   * @return Sorted array.
   */
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    this.divide(arr, 0, arr.length - 1);
    return arr;
  }

  /**
   * Recursivly divide array until there is only one element each.
   *
   * @param <T>   Type must support comparison via the Comparable interface.
   * @param arr   Array to be sorted.
   * @param left  First index.
   * @param right Last index.
   */
  private <T extends Comparable<T>> void divide(T[] arr, int left, int right) {
    if (left < right) {
      // Calculate middle
      int middle = (int) Math.floor((left + right) / 2);

      // Call divide recursively on left and right, lastly merge
      this.divide(arr, left, middle);
      this.divide(arr, middle + 1, right);
      this.merge(arr, left, middle, right);
    }
  }

  /**
   * Merge bottom up such that divided parts get sorted.
   *
   * @param <T>    Type must support comparison via the Comparable interface.
   * @param arr    Array to be sorted.
   * @param left   First index.
   * @param middle Middle index.
   * @param right  Last index.
   */
  @SuppressWarnings("unchecked")
  private <T extends Comparable<T>> void merge(T[] arr, int left, int middle, int right) {
    // Auxillary array for sorting
    T[] tmp = (T[]) new Comparable[right - left + 1];

    int k = left;
    int m = middle + 1;
    int i = 0;

    // Pick smallest value of left and right
    while (k <= middle && m <= right) {
      if (CompareUtils.lessThan(arr[k], arr[m])) {
        tmp[i] = arr[k];
        k++;
      } else {
        tmp[i] = arr[m];
        m++;
      }

      i++;
    }

    // Take care of left leftovers
    while (k <= middle) {
      tmp[i] = arr[k];
      k++;
      i++;
    }

    // Take care of right leftovers
    while (m <= right) {
      tmp[i] = arr[m];
      m++;
      i++;
    }

    // Copy values from auxillary array to arr
    for (int j = 0; j < i; j++) {
      arr[left + j] = tmp[j];
    }
  }

}
