package com.algorithms.searching;

import com.algorithms.interfaces.Searching;
import com.algorithms.interfaces.SearchingTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest implements SearchingTest<Searching> {

  @Override
  public Searching createInstance() {
    return new BinarySearch();
  }

  @Test
  public void testIllegalArgumentException() {
    Integer[] arr = new Integer[] { 9, 6, 2 };
    int key = 9;

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      this.createInstance().search(arr, key);
    });
  }
}
