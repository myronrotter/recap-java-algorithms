package com.algorithms.interfaces;

/**
 * Interface for searching algorithms operating on integers only.
 */
public interface Finding {

  /**
   * Searching an element { @param key } within an array { @param arr }. This
   * method is for search algorithms operating on integers only.
   *
   * @param arr The integer array to be searched.
   * @param key The integer key to be searched for
   * @return Index of the key if it exists otherwise -1.
   */
  public int find(Integer[] arr, Integer key);
}
