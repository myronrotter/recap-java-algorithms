package com.algorithms.searching;

import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Searching algorithm: JumpSearch.
 */
public class JumpSearch {

  /**
   * Searching an element within an array via JumpSearch.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr Array to be searched.
   * @param key The key to be searched for.
   * @return Index of key in array or -1.
   */
  public <T extends Comparable<T>> int search(T[] arr, T key) {
    if (!SortingUtils.isSorted(arr)) {
      throw new IllegalArgumentException("Input array is not sorted.");
    }

    // Define jump size
    int jumpSize = (int) Math.floor(Math.sqrt(arr.length));
    int jump = jumpSize;
    int lastJump = 0;

    // Find key between lastJump und jump, if key is in array
    while (CompareUtils.lessThan(arr[Math.min(jump, arr.length) - 1], key)) {
      if (jump >= arr.length) {
        return -1;
      }
      lastJump = jump;
      jump += jumpSize;
    }

    // Perform linearSearch
    for (int i = lastJump; i < jump; i++) {
      if (CompareUtils.equalTo(arr[i], key)) {
        return i;
      }
    }

    return -1;
  }
}
