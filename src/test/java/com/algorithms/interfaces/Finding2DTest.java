package com.algorithms.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface Finding2DTest<T extends Finding2D> {

  T createInstance();

  @Test
  public default void testFind2DOnInputNull() {
    Integer key = 7;
    Integer[][] arr = null;
    int[] expected = new int[] { -1, -1 };

    Assertions.assertArrayEquals(expected, this.createInstance().find(arr, key));
  }

  @Test
  public default void testFind2DOnInputSizeZero() {
    Integer key = 7;
    Integer[][] arr = new Integer[][] {};
    int[] expected = new int[] { -1, -1 };

    Assertions.assertArrayEquals(expected, this.createInstance().find(arr, key));
  }

  @Test
  public default void testFind2DOnSortedIntegerInputFoundKey() {
    Integer key = 4;
    Integer[][] arr = new Integer[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
    int[] expected = new int[] { 1, 1 };

    Assertions.assertArrayEquals(expected, this.createInstance().find(arr, key));
  }

  @Test
  public default void testFind2DOnSortedIntegerInputNotFoundKey() {
    Integer key = 10;
    Integer[][] arr = new Integer[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
    int[] expected = new int[] { -1, -1 };

    Assertions.assertArrayEquals(expected, this.createInstance().find(arr, key));
  }
}
