package com.algorithms.searching;

import com.algorithms.interfaces.Finding;
import com.algorithms.interfaces.FindingTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InterpolationSearchTest implements FindingTest<Finding> {

  @Override
  public Finding createInstance() {
    return new InterpolationSearch();
  }

  @Test
  public void testIllegalArgumentException() {
    Integer[] arr = new Integer[] { 9, 6, 2 };
    int key = 9;

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      this.createInstance().find(arr, key);
    });
  }
}
