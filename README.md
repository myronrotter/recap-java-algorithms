# Recap java algorithms

Main purpose of this project is to recap and re-implement common-used and -known algorithms in Java and their properties as well as getting used to Maven, EditorConfig and GitHub actions/ workflows. Properties of implemented algorithms may differ from properties listed below. Some algorithms are plain implementations of common-known pseudocode.

## Sorting

| name          | best-case            | average-case         | worst-case | in-place                    | stable |
| ------------- | -------------------- | -------------------- | ---------- | --------------------------- | ------ |
| InsertionSort | $\Omega(n)$          | $\Theta(n^2)$        | $O(n^2)$   | Yes                         | Yes    |
| SelectionSort | $\Omega(n^2)$        | $\Theta(n^2)$        | $O(n^2)$   | Yes                         | No     |
| BubbleSort    | $\Omega(n)$          | $\Theta(n^2)$        | $O(n^2)$   | Yes                         | Yes    |
| ShellSort[^1] | $\Omega(n * log(n))$ | $\Theta(n * log(n))$ | $O(n^2)$   | Yes                         | No     |
| CombSort[^1]  | $\Omega(n * log(n))$ | $\Theta(n^2/2^p)$    | $O(n^2)$   | Yes                         | No     |
| CountingSort  | $\Omega(n+k)$        | $\Theta(n+k)$        | $O(n+k)$   | No (uses auxillary storage) | Yes    |
| BucketSort    | $\Omega(n+b)$        | $\Theta(n+b)$        | $O(n^2)$   | No (uses auxillary storage) | No     |

|     | description                     |
| --- | ------------------------------- |
| $k$ | the range of the input interval |
| $b$ | the number of buckets           |
| $p$ | the number of increments        |

[^1]: Strictly, depends on gap sequence/ size.
