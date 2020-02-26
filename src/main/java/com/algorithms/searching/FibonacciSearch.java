package com.algorithms.searching;

import com.algorithms.interfaces.Searching;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Searching algorithm: FibonacciSearch.
 */
public class FibonacciSearch implements Searching {

  @Override
  public <T extends Comparable<T>> int search(T[] arr, T key) {
    if (arr == null || arr.length == 0) {
      return -1;
    } else if (!SortingUtils.isSorted(arr)) {
      throw new IllegalArgumentException("Input array is not sorted.");
    }

    // Initialize three successive fibonacci numbers
    int fib2 = 0;
    int fib1 = 1;
    int fib = fib2 + fib1;

    // Initialize boundary
    int left = -1;
    int i;

    // Calculate fib such that it is the smallest fibonacci number equal to or
    // greater than the size of the input array
    while (fib < arr.length) {
      fib2 = fib1;
      fib1 = fib;
      fib = fib2 + fib1;
    }

    while (fib > 1) {
      // Since fib2 can be greater than size of the array, check boundaries
      i = Math.min(left + fib2, arr.length - 1);

      if (CompareUtils.lessThan(arr[i], key)) {
        // Do not need to search between left and i
        fib = fib1;
        fib1 = fib2;
        fib2 = fib - fib1;
        left = i;
      } else if (CompareUtils.greaterThan(arr[i], key)) {
        // Do not need to search after i
        fib = fib2;
        fib1 = fib1 - fib2;
        fib2 = fib - fib1;
      } else {
        return i;
      }
    }

    if (fib1 == 1 && CompareUtils.equalTo(arr[left], key))
      return left + 1;

    return -1;
  }

  @Override
  public int find(Integer[] arr, Integer key) {
    return this.search(arr, key);
  }
}
