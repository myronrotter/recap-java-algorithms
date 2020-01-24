package com.algorithms.searching;

import com.algorithms.interfaces.Searching;
import com.algorithms.interfaces.SearchingTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinearSearchTest implements SearchingTest<Searching> {

  @Override
  public Searching createInstance() {
    return new LinearSearch();
  }

  @Test
  public void testSearchOnSortedDuplicateIntegerInputFoundKey() {
    Integer key = 1;
    Integer[] arr = new Integer[] { 0, 0, 0, 0, 1, 1, 1, 1 };
    int expected = 4;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public void testUnsortedIntegerInputFoundKey() {
    int key = 7;
    Integer[] arr = new Integer[] { 9, 6, 2, 3, 0, 4, 5, 1, 7, 8 };
    int expected = 8;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public void testUnsortedIntegerInputNotFoundKey() {
    int key = 10;
    Integer[] arr = new Integer[] { 9, 6, 2, 3, 0, 4, 5, 1, 7, 8 };
    int expected = -1;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public void testUnsortedDuplicateIntegerInputFoundKey() {
    Integer key = 1;
    Integer[] arr = new Integer[] { 0, 1, 0, 0, 1, 1, 0, 1 };
    int expected = 1;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }
}
