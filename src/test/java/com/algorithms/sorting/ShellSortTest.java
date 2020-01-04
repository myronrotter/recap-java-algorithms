package com.algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

public class ShellSortTest {
  ShellSort shellSort = new ShellSort();

  @Test
  public void testPositiveIntegers() {
    Integer[] arr = new Integer[] { 9, 6, 2, 3, 0, 4, 5, 1, 7, 8 };
    Integer[] expected = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    Assert.assertArrayEquals(expected, shellSort.sort(arr));
  }

  @Test
  public void testNegativeIntegers() {
    Integer[] arr = new Integer[] { -9, -6, -2, -3, 0, -4, -5, -1, -7, -8 };
    Integer[] expected = new Integer[] { -9, -8, -7, -6, -5, -4, -3, -2, -1, 0 };

    Assert.assertArrayEquals(expected, shellSort.sort(arr));
  }

  @Test
  public void testMixedIntegers() {
    Integer[] arr = new Integer[] { -50, 3, -1, 90, 77, 2, 5, 0, -100 };
    Integer[] expected = new Integer[] { -100, -50, -1, 0, 2, 3, 5, 77, 90 };

    Assert.assertArrayEquals(expected, shellSort.sort(arr));
  }

  @Test
  public void testDuplicateIntegers() {
    Integer[] arr = new Integer[] { 0, 1, 0, 1, 0, 0 };
    Integer[] expected = new Integer[] { 0, 0, 0, 0, 1, 1 };

    Assert.assertArrayEquals(expected, shellSort.sort(arr));
  }

  @Test
  public void testCharacters() {
    Character[] arr = new Character[] { 'g', 'f', 'e', 'd', 'c', 'b', 'a' };
    Character[] expected = new Character[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

    Assert.assertArrayEquals(expected, shellSort.sort(arr));
  }

  @Test
  public void testDuplicateCharacters() {
    Character[] arr = new Character[] { 'g', 'g', 'g', 'd', 'c', 'b', 'a' };
    Character[] expected = new Character[] { 'a', 'b', 'c', 'd', 'g', 'g', 'g' };

    Assert.assertArrayEquals(expected, shellSort.sort(arr));
  }

  @Test
  public void testStrings() {
    String[] arr = new String[] { "aaaa", "aaaaa", "cca", "bba", "bbba", "zz" };
    String[] expected = new String[] { "aaaa", "aaaaa", "bba", "bbba", "cca", "zz" };

    Assert.assertArrayEquals(expected, shellSort.sort(arr));
  }
}
