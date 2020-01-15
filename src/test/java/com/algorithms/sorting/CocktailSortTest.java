package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;

class CocktailSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new CocktailSort();
  }
}
