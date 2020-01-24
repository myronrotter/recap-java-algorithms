package com.algorithms.searching;

import com.algorithms.interfaces.Searching2D;
import com.algorithms.utils.CompareUtils;
import com.algorithms.utils.SortingUtils;

/**
 * Searching algorithm in 2D: SaddlebackSearch.
 */
public class SaddlebackSearch implements Searching2D {

  @Override
  public <T extends Comparable<T>> int[] search(T[][] arr, T key) {
    if (arr == null || arr.length == 0) {
      return new int[] { -1, -1 };
    } else if (!SortingUtils.isSorted2D(arr)) {
      throw new IllegalArgumentException("Input array is not sorted.");
    }

    // Initialize output
    int rowIndex = -1;
    int columnIndex = -1;
    // Initialize iterators
    // Go bottom-up
    int row = arr.length - 1;
    int col = 0;
    int length = arr[row].length - 1;

    while (row >= 0 && col <= length) {
      if (CompareUtils.equalTo(arr[row][col], key)) {
        rowIndex = row;
        columnIndex = col;
        break;
      } else if (CompareUtils.lessThan(key, arr[row][col]) && row != 0) {
        // Go row up
        row--;
        length = arr[row].length - 1;
      } else {
        // Search in row
        col++;
      }
    }

    return new int[] { rowIndex, columnIndex };
  }

  @Override
  public int[] find(Integer[][] arr, Integer key) {
    return this.search(arr, key);
  }
}
