package com.algorithms.interfaces;

/**
 * Interface for searching algorithms in 2D.
 */
public interface Searching2D extends Finding2D {

  /**
   * Searching an element { @param key } within an 2D array { @param arr }.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr The 2D array to be searched.
   * @param key The key to be searched for.
   * @return Index of the key as size 2 int array if it exists otherwise -1.
   */
  public <T extends Comparable<T>> int[] search(T[][] arr, T key);
}
