package com.algorithms.interfaces;

/**
 * Interface for sorting algorithms.
 */
public interface Sorting {

  /**
   * Sorting the input array { @param arr }.
   *
   * @param <T> Type must support comparison via the Comparable interface.
   * @param arr The array to be sorted.
   * @return The sorted array..
   */
  public <T extends Comparable<T>> T[] sort(T[] arr);
}
