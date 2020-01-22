package com.algorithms.searching;

import com.algorithms.interfaces.Finding;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface FindingTest<T extends Finding> {

  T createInstance();

  @Test
  public default void testFindOnSortedIntegerInputFoundKey() {
    Integer key = 7;
    Integer[] arr = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int expected = 7;

    Assertions.assertEquals(expected, this.createInstance().find(arr, key));
  }

  @Test
  public default void testFindOnSortedIntegerInputNotFoundKey() {
    Integer key = 10;
    Integer[] arr = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int expected = -1;

    Assertions.assertEquals(expected, this.createInstance().find(arr, key));
  }
}
