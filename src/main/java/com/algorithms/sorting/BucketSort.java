package com.algorithms.sorting;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.algorithms.interfaces.Sorting;

/**
 * Sorting algorithm: BucketSort.
 */
public class BucketSort implements Sorting {

  @Override
  public <T extends Comparable<T>> T[] sort(T[] arr) {
    TreeMap<Byte, ArrayList<T>> buckets = new TreeMap<>();
    List<T> sortedList = new ArrayList<>();

    // Create buckets
    for (byte key = -15; key <= 15; key++) {
      buckets.put(key, new ArrayList<>());
    }

    // Sort input into buckets according to top 4 significant bits
    byte[] bytes;
    for (int i = 0; i < arr.length; i++) {
      bytes = ByteBuffer.allocate(4).putInt(arr[i].hashCode()).array();
      Byte significant = (byte) (bytes[0] >>> 4);
      buckets.get(significant).add(arr[i]);
    }

    // Sort each bucket, any sorting algorithm is fine
    // Note: Recursive BucketSort could take 4bit steps dividing input into buckets
    for (Map.Entry<Byte, ArrayList<T>> bucket : buckets.entrySet()) {
      Collections.sort(bucket.getValue());
    }

    // Concatenate buckets
    for (Map.Entry<Byte, ArrayList<T>> bucket : buckets.entrySet()) {
      sortedList.addAll(bucket.getValue());
    }

    return sortedList.toArray(arr);
  }

}
