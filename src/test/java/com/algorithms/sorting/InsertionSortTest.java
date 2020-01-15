package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;

class InsertionSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new InsertionSort();
  }
}
