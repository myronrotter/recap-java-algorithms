package com.algorithms.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface Searching2DTest<T extends Searching2D> extends Finding2DTest<Finding2D> {

  T createInstance();

  @Test
  public default void testSearch2DOnInputNull() {
    Integer key = 7;
    Integer[][] arr = null;
    int[] expected = new int[] { -1, -1 };

    Assertions.assertArrayEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearch2DOnInputSizeZero() {
    Integer key = 7;
    Integer[][] arr = new Integer[][] {};
    int[] expected = new int[] { -1, -1 };

    Assertions.assertArrayEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearch2DOnSortedIntegerInputFoundKey() {
    Integer key = 4;
    Integer[][] arr = new Integer[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
    int[] expected = new int[] { 1, 1 };

    Assertions.assertArrayEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearch2DOnSortedIntegerInputNotFoundKey() {
    Integer key = 10;
    Integer[][] arr = new Integer[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
    int[] expected = new int[] { -1, -1 };

    Assertions.assertArrayEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearch2DOnSortedCharactersInputFoundKey() {
    Character key = 'g';
    Character[][] arr = new Character[][] { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i', 'j' } };
    int[] expected = new int[] { 2, 0 };

    Assertions.assertArrayEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearch2DOnSortedCharactersInputNotFoundKey() {
    Character key = 'k';
    Character[][] arr = new Character[][] { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i', 'j' } };
    int[] expected = new int[] { -1, -1 };

    Assertions.assertArrayEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearch2DOnSortedStringsInputFoundKey() {
    String key = "bba";
    String[][] arr = new String[][] { { "aaaa", "aaaaa", "bba" }, { "bbba", "cca", "xyz" }, { "yy", "zz" } };
    int[] expected = new int[] { 0, 2 };

    Assertions.assertArrayEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearch2DOnSortedStringsInputNotFoundKey() {
    String key = "a";
    String[][] arr = new String[][] { { "aaaa", "aaaaa", "bba" }, { "bbba", "cca", "xyz" }, { "yy", "zz" } };
    int[] expected = new int[] { -1, -1 };

    Assertions.assertArrayEquals(expected, this.createInstance().search(arr, key));
  }
}
