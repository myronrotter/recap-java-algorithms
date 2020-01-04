package com.algorithms.utils;

/**
 * Utility class for sorting algorithms.
 */
public class SortingUtils {
  public static <T extends Comparable<T>> void swap(T[] arr, int positionX, int positionY) {
    T value = arr[positionX];
    arr[positionX] = arr[positionY];
    arr[positionY] = value;
  }
}
