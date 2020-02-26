package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: HeapSort.
 */
public class HeapSort implements Sorting {

  @Override
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    if (arr == null || arr.length == 0) {
      return arr;
    }

    // Build max-heap
    for (int i = (int) (arr.length / 2) - 1; i >= 0; i--) {
      heapify(arr, i, arr.length);
    }

    for (int i = arr.length - 1; i > 0; i--) {
      SortingUtils.swap(arr, i, 0);
      this.heapify(arr, 0, i);
    }

    return arr;
  }

  /**
   * Heapify method secure heap requirements.
   *
   * @param <T>   Type must support comparison via the Comparable interface.
   * @param arr   Heap as array to check for heap requirements.
   * @param index Index of root.
   * @param size  Size of heap.
   */
  private <T extends Comparable<T>> void heapify(T[] arr, int index, int size) {
    int max = index;
    int left = 2 * index + 1;
    int right = 2 * index + 2;

    max = (left < size && CompareUtils.greaterThan(arr[left], arr[max])) ? left : max;
    max = (right < size && CompareUtils.greaterThan(arr[right], arr[max])) ? right : max;

    // Still need to heapify?
    if (max != index) {
      SortingUtils.swap(arr, index, max);
      this.heapify(arr, max, size);
    }
  }

}
