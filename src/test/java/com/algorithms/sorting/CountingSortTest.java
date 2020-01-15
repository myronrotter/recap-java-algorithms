package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;

class CountingSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new CountingSort();
  }
}
