package com.algorithms.searching;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.algorithms.interfaces.Searching;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class SearchTest {

  private Class<Searching> searchClass;
  private Searching searchAlgorithm;

  public SearchTest(Class<Searching> cl) {
    this.searchClass = cl;
  }

  @Parameters
  public static Collection<Object[]> getSearchAlgorithmClasses() {
    List<Object[]> searchAlgorithmClasses = new ArrayList<Object[]>();
    searchAlgorithmClasses.add(new Object[] { LinearSearch.class });
    searchAlgorithmClasses.add(new Object[] { BinarySearch.class });
    searchAlgorithmClasses.add(new Object[] { JumpSearch.class });
    return searchAlgorithmClasses;
  }

  @Before
  public void setUp() throws InstantiationException, IllegalAccessException {
    this.searchAlgorithm = (Searching) this.searchClass.newInstance();
  }

  @Test
  public void testFoundKey() {
    int key = 7;
    Integer[] arr = new Integer[] { 9, 6, 2, 3, 0, 4, 5, 7, 1, 8 };
    int expected = 7;

    Assert.assertEquals(expected, this.searchAlgorithm.search(arr, key));
  }

  @Test
  public void testNotFoundKey() {
    int key = 10;
    Integer[] arr = new Integer[] { 9, 6, 2, 3, 0, 4, 5, 1, 7, 8 };
    int expected = -1;

    Assert.assertEquals(expected, this.searchAlgorithm.search(arr, key));
  }
}
