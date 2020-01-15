package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;

class CombSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new CombSort();
  }
}
