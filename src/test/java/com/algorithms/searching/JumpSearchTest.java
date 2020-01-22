package com.algorithms.searching;

import com.algorithms.interfaces.Searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JumpSearchTest implements SearchingTest<Searching> {

  @Override
  public Searching createInstance() {
    return new JumpSearch();
  }

  @Test
  public void testIllegalArgumentException() {
    Integer[] arr = new Integer[] { 9, 6, 2 };
    int key = 9;

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      this.createInstance().search(arr, key);
    });
  }

  @Test
  public void testSearchOnSortedDuplicateIntegerInputFoundKey() {
    Integer key = 1;
    Integer[] arr = new Integer[] { 0, 0, 0, 0, 1, 1, 1, 1 };
    int expected = 4;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }
}
