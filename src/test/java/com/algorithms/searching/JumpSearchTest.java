package com.algorithms.searching;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class JumpSearchTest {
  JumpSearch jumpSearch = new JumpSearch();

  @Test
  public void testIllegalArgumentException() {
    Integer[] arr = new Integer[] { 9, 6, 2 };
    int key = 9;

    try {
      jumpSearch.search(arr, key);

      fail("Expected an IllegalArgumentException to be thrown.");
    } catch (IllegalArgumentException e) {
      Assert.assertTrue(e.getMessage().equals("Input array is not sorted."));
    }
  }

  @Test
  public void testFound() {
    int key = 9;
    Integer[] arr = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int expected = 9;

    Assert.assertEquals(expected, jumpSearch.search(arr, key));
  }

  @Test
  public void testNotFound() {
    int key = 10;
    Integer[] arr = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int expected = -1;

    Assert.assertEquals(expected, jumpSearch.search(arr, key));
  }
}
