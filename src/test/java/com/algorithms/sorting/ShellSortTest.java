package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;

class ShellSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new ShellSort();
  }
}
