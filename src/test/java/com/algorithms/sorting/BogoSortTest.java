package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;

class BogoSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new BogoSort();
  }
}
