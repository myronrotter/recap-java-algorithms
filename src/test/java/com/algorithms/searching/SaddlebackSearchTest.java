package com.algorithms.searching;

import com.algorithms.interfaces.Searching2D;
import com.algorithms.interfaces.Searching2DTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SaddlebackSearchTest implements Searching2DTest<Searching2D> {

  @Override
  public Searching2D createInstance() {
    return new SaddlebackSearch();
  }

  @Test
  public void testIllegalArgumentException() {
    Integer[][] arr = new Integer[][] { { 0, 1, 3 }, { 2, 4, 5 }, { 6, 7, 8, 9 } };
    int key = 9;

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      this.createInstance().search(arr, key);
    });
  }

  @Test
  public void testBla() {
    String key = "a";
    String[][] arr = new String[][] { { "aaaa", "aaaaa", "bba" }, { "bbba", "cca", "xyz" }, { "yy", "zz" } };
    int[] expected = new int[] { -1, -1 };

    Assertions.assertArrayEquals(expected, this.createInstance().search(arr, key));
  }
}
