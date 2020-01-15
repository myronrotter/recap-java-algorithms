package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.MathUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Sorting algorithm: BitonicSort. Algorithm for parallel sorting.
 */
public class BitonicSort implements Sorting {

  @Override
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    // Length of array must be a power of 2
    if (!MathUtils.isPowerOfTwo(arr.length)) {
      throw new IllegalArgumentException("Length of input array is not a power of two.");
    }

    // Return input if nothin to be sorted
    if (arr.length <= 1) {
      return arr;
    }

    // Create bitonic sequences recursively and merge
    this.createBitonicSequence(arr, 0, arr.length, true);
    return arr;
  }

  /**
   * Recursively creates a bitonic sequence by sorting index and num in opposite
   * order and final merge both halves.
   *
   * @param <T>       Type must support comparison via the Comparable interface.
   * @param arr       Array to be sorted.
   * @param index     Starting index of sequence.
   * @param num       Number of elements in sequence.
   * @param ascending True iff sorted in ascending order.
   */
  private <T extends Comparable<T>> void createBitonicSequence(T[] arr, int index, int num, boolean ascending) {
    int middle = num / 2;

    if (num >= 2) {
      // Sort lower half in ascending order
      createBitonicSequence(arr, index, middle, true);
      // Sort upper half in descending order
      createBitonicSequence(arr, index + middle, middle, false);
      // Finally, merge sequence
      merge(arr, index, num, ascending);
    }
  }

  /**
   * Recursively sorts a bitonic sequence by merging both halves.
   *
   * @param <T>       Type must support comparison via the Comparable interface.
   * @param arr       Array to be sorted.
   * @param index     Starting index of elementes to be sorted.
   * @param num       Number of elements to be sorted.
   * @param ascending True iff sorted in ascending order.
   */
  private <T extends Comparable<T>> void merge(T[] arr, int index, int num, boolean ascending) {
    int middle = num / 2;

    if (num >= 2) {
      for (int i = index; i < index + middle; i++) {
        // Swap elements regarding ascending or descending sorting order
        if ((CompareUtils.greaterThan(arr[i], arr[i + middle]) && ascending)
            || (CompareUtils.lessThan(arr[i], arr[i + middle]) && !ascending)) {
          SortingUtils.swap(arr, i, i + middle);
        }
      }

      merge(arr, index, middle, ascending);
      merge(arr, index + middle, middle, ascending);
    }
  }

}
