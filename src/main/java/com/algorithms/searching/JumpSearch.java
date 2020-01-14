package com.algorithms.searching;

import java.util.Arrays;

import com.algorithms.interfaces.Searching;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Searching algorithm: JumpSearch.
 */
public class JumpSearch implements Searching {

  @Override
  public <T extends Comparable<T>> int search(T[] arr, T key) {
    if (!SortingUtils.isSorted(arr)) {
      // throw new IllegalArgumentException("Input array is not sorted.");
      Arrays.sort(arr);
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
