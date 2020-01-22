package com.algorithms.interfaces;

/**
 * Interface for searching algorithms.
 */
public interface Searching extends Finding {

  /**
   * Searching an element { @param key } within an array { @param arr }.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr The array to be searched.
   * @param key The key to be searched for.
   * @return Index of the key if it exists otherwise -1.
   */
  public <T extends Comparable<T>> int search(T[] arr, T key);
}
