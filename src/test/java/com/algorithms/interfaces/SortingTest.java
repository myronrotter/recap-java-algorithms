package com.algorithms.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface SortingTest<T extends Sorting> {

  T createInstance();

  @Test
  public default void testInputNull() {
    Integer[] arr = null;
    Integer[] expected = null;

    Assertions.assertArrayEquals(expected, this.createInstance().sort(arr));
  }

  @Test
  public default void testInputSizeZero() {
    Integer[] arr = new Integer[] {};
    Integer[] expected = new Integer[] {};

    Assertions.assertArrayEquals(expected, this.createInstance().sort(arr));
  }

  @Test
  public default void testPositiveIntegers() {
    Integer[] arr = new Integer[] { 6, 2, 3, 0, 4, 5, 1, 7 };
    Integer[] expected = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7 };

    Assertions.assertArrayEquals(expected, this.createInstance().sort(arr));
  }

  @Test
  public default void testNegativeIntegers() {
    Integer[] arr = new Integer[] { -6, -2, -3, 0, -4, -5, -1, -7 };
    Integer[] expected = new Integer[] { -7, -6, -5, -4, -3, -2, -1, 0 };

    Assertions.assertArrayEquals(expected, this.createInstance().sort(arr));
  }

  @Test
  public default void testMixedIntegers() {
    Integer[] arr = new Integer[] { -50, 3, -1, 90, 77, 2, 5, 0 };
    Integer[] expected = new Integer[] { -50, -1, 0, 2, 3, 5, 77, 90 };

    Assertions.assertArrayEquals(expected, this.createInstance().sort(arr));
  }

  @Test
  public default void testDuplicateIntegers() {
    Integer[] arr = new Integer[] { 0, 1, 0, 1, 0, 0, 1, 1 };
    Integer[] expected = new Integer[] { 0, 0, 0, 0, 1, 1, 1, 1 };

    Assertions.assertArrayEquals(expected, this.createInstance().sort(arr));
  }

  @Test
  public default void testCharacters() {
    Character[] arr = new Character[] { 'g', 'f', 'e', 'd', 'c', 'b', 'a', 'w' };
    Character[] expected = new Character[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'w' };

    Assertions.assertArrayEquals(expected, this.createInstance().sort(arr));
  }

  @Test
  public default void testDuplicateCharacters() {
    Character[] arr = new Character[] { 'g', 'g', 'g', 'd', 'c', 'b', 'a', 'a' };
    Character[] expected = new Character[] { 'a', 'a', 'b', 'c', 'd', 'g', 'g', 'g' };

    Assertions.assertArrayEquals(expected, this.createInstance().sort(arr));
  }

  @Test
  public default void testStrings() {
    String[] arr = new String[] { "aaaa", "aaaaa", "cca", "bba", "bbba", "zz", "bba", "cca" };
    String[] expected = new String[] { "aaaa", "aaaaa", "bba", "bba", "bbba", "cca", "cca", "zz" };

    Assertions.assertArrayEquals(expected, this.createInstance().sort(arr));
  }

  @Test
  public default void testDuplicateStrings() {
    String[] arr = new String[] { "aaaa", "aaaaa", "aaaa", "aaaaa", "aaaaa", "aaaa", "aaaaa", "aaaa" };
    String[] expected = new String[] { "aaaa", "aaaa", "aaaa", "aaaa", "aaaaa", "aaaaa", "aaaaa", "aaaaa" };

    Assertions.assertArrayEquals(expected, this.createInstance().sort(arr));
  }
}
