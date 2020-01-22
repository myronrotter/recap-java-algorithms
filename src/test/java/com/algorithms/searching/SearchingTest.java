package com.algorithms.searching;

import com.algorithms.interfaces.Finding;
import com.algorithms.interfaces.Searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public interface SearchingTest<T extends Searching> extends FindingTest<Finding> {

  T createInstance();

  @Test
  public default void testSearchOnSortedIntegerInputFoundKey() {
    Integer key = 7;
    Integer[] arr = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int expected = 7;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearchOnSortedIntegerInputNotFoundKey() {
    Integer key = 10;
    Integer[] arr = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int expected = -1;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearchOnSortedCharactersInputFoundKey() {
    Character key = 'g';
    Character[] arr = new Character[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'w' };
    int expected = 6;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearchOnSortedCharactersInputNotFoundKey() {
    Character key = 'h';
    Character[] arr = new Character[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'w' };
    int expected = -1;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearchOnSortedStringsInputFoundKey() {
    String key = "bba";
    String[] arr = new String[] { "aaaa", "aaaaa", "bba", "bbba", "cca", "xyz", "yy", "zz" };
    int expected = 2;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }

  @Test
  public default void testSearchOnSortedStringsInputNotFoundKey() {
    String key = "zzz";
    String[] arr = new String[] { "aaaa", "aaaaa", "bba", "bbba", "cca", "xyz", "yy", "zz" };
    int expected = -1;

    Assertions.assertEquals(expected, this.createInstance().search(arr, key));
  }
}
