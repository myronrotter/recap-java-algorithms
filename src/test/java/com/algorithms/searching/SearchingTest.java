package com.algorithms.searching;

import com.algorithms.interfaces.Searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface SearchingTest<T extends Searching> {

  T createInstance();

  @Test
  public default void testSortedInputFoundKey() {
    int key = 7;
    Integer[] arr = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int expected = 7;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSortedInputNotFoundKey() {
    int key = 10;
    Integer[] arr = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int expected = -1;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }
}
