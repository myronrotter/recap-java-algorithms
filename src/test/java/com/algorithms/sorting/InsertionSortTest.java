package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;
import com.algorithms.interfaces.SortingTest;

class InsertionSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new InsertionSort();
  }
}
