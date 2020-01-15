package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;

class QuickSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new QuickSort();
  }
}
