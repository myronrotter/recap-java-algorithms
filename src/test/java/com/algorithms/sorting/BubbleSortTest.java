package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;

class BubbleSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new BubbleSort();
  }
}
