package com.algorithms.searching;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {
  LinearSearch linearSearch = new LinearSearch();

  @Test
  public void testFound() {
    int key = 7;
    Integer[] arr = new Integer[] { 9, 6, 2, 3, 0, 4, 5, 1, 7, 8 };
    int expected = 8;

    Assert.assertEquals(expected, linearSearch.search(arr, key));
  }

  @Test
  public void testNotFound() {
    int key = 10;
    Integer[] arr = new Integer[] { 9, 6, 2, 3, 0, 4, 5, 1, 7, 8 };
    int expected = -1;

    Assert.assertEquals(expected, linearSearch.search(arr, key));
  }
}
