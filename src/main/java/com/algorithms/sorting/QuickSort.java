package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: QuickSort. Uses divide and conquer.
 */
public class QuickSort implements Sorting {

  @Override
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    if (arr == null || arr.length == 0) {
      return arr;
    }

    this.divide(arr, 0, arr.length - 1);
    return arr;
  }

  /**
   * Divide array according to index of pivot element.
   *
   * @param <T>   Type must support comparison via the Comparable interface.
   * @param arr   Array to be sorted.
   * @param left  Index left from pivot.
   * @param right Index right from pivot.
   */
  private <T extends Comparable<T>> void divide(T[] arr, int left, int right) {
    if (left < right) {
      // Find index of pivot element
      int pivot = this.partition(arr, left, right);

      // Divide array according to pivot index
      this.divide(arr, left, pivot - 1);
      this.divide(arr, pivot + 1, right);
    }
  }

  /**
   *
   * @param <T>   Type must support comparison via the Comparable interface.
   * @param arr   Array to be sorted.
   * @param left  Index left from pivot.
   * @param right Index right from pivot.
   * @return Index of next pivot element.
   */
  private <T extends Comparable<T>> int partition(T[] arr, int left, int right) {
    T pivot = arr[left];
    int index = left;

    for (int i = index + 1; i <= right; i++) {
      if (CompareUtils.lessThan(arr[i], pivot)) {
        index++;
        SortingUtils.swap(arr, i, index);
      }
    }

    SortingUtils.swap(arr, left, index);

    return index;
  }
}
