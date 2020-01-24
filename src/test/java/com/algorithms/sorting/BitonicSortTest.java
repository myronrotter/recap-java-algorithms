package com.algorithms.sorting;

import com.algorithms.interfaces.Sorting;
import com.algorithms.interfaces.SortingTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BitonicSortTest implements SortingTest<Sorting> {

  @Override
  public Sorting createInstance() {
    return new BitonicSort();
  }

  @Test
  public void testIllegalArgumentException() {
    Integer[] arr = new Integer[] { 9, 6, 2 };

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      this.createInstance().sort(arr);
    });
  }
}
