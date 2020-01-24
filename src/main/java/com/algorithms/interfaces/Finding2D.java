package com.algorithms.interfaces;

/**
 * Interface for searching algorithms in 2D operating on integers only.
 */
public interface Finding2D {

  /**
   * Searching an element { @param key } within an 2D array { @param arr }. This
   * method is for search algorithms operating on integers only.
   *
   * @param arr The 2D integer array to be searched.
   * @param key The integer key to be searched for
   * @return Index of the key as size 2 int array [row , col] if it exists
   *         otherwise -1.
   */
  public int[] find(Integer[][] arr, Integer key);
}
