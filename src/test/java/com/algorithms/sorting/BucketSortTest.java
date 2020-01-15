package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;

class BucketSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new BucketSort();
  }
}
