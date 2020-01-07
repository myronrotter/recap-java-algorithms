package com.algorithms.sorting;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class BitonicSortTest {
  BitonicSort bitonicSort = new BitonicSort();

  @Test
  public void testIllegalArgumentException() {
    Integer[] arr = new Integer[] { 9, 6, 2 };

    try {
      bitonicSort.sort(arr);

      fail("Expected an IllegalArgumentException to be thrown.");
    } catch (IllegalArgumentException e) {
      Assert.assertTrue(e.getMessage().equals("Length of input array is not a power of two."));
    }
  }

  @Test
  public void testPositiveIntegers() {
    Integer[] arr = new Integer[] { 9, 6, 2, 3, 0, 4, 5, 1 };
    Integer[] expected = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 9 };

    Assert.assertArrayEquals(expected, bitonicSort.sort(arr));
  }

  @Test
  public void testNegativeIntegers() {
    Integer[] arr = new Integer[] { -9, -6, -2, -3, 0, -4, -5, -1 };
    Integer[] expected = new Integer[] { -9, -6, -5, -4, -3, -2, -1, 0 };

    Assert.assertArrayEquals(expected, bitonicSort.sort(arr));
  }

  @Test
  public void testMixedIntegers() {
    Integer[] arr = new Integer[] { -50, 3, -1, 90, 77, 2, 0, -100 };
    Integer[] expected = new Integer[] { -100, -50, -1, 0, 2, 3, 77, 90 };

    Assert.assertArrayEquals(expected, bitonicSort.sort(arr));
  }

  @Test
  public void testDuplicateIntegers() {
    Integer[] arr = new Integer[] { 0, 1, 0, 1, 0, 0, 0, 1 };
    Integer[] expected = new Integer[] { 0, 0, 0, 0, 0, 1, 1, 1 };

    Assert.assertArrayEquals(expected, bitonicSort.sort(arr));
  }

  @Test
  public void testCharacters() {
    Character[] arr = new Character[] { 'g', 'f', 'e', 'd', 'c', 'b', 'a', 'z' };
    Character[] expected = new Character[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'z' };

    Assert.assertArrayEquals(expected, bitonicSort.sort(arr));
  }

  @Test
  public void testDuplicateCharacters() {
    Character[] arr = new Character[] { 'g', 'g', 'g', 'd', 'c', 'b', 'a', 'z' };
    Character[] expected = new Character[] { 'a', 'b', 'c', 'd', 'g', 'g', 'g', 'z' };

    Assert.assertArrayEquals(expected, bitonicSort.sort(arr));
  }

  @Test
  public void testStrings() {
    String[] arr = new String[] { "aaaa", "ba", "a", "aaaaa", "cca", "bba", "bbba", "zz" };
    String[] expected = new String[] { "a", "aaaa", "aaaaa", "ba", "bba", "bbba", "cca", "zz" };

    Assert.assertArrayEquals(expected, bitonicSort.sort(arr));
  }
}
