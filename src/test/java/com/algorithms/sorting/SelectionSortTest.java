package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;

class SelectionSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new SelectionSort();
  }
}
