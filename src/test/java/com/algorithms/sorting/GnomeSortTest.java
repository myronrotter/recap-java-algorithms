package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;

class GnomeSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new GnomeSort();
  }
}
