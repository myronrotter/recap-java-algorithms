# Recap java algorithms

Main purpose of this project is to recap and re-implement common-used and well-known algorithms in Java and their properties as well as getting used to Maven, EditorConfig and GitHub actions/ workflows. Properties of implemented algorithms may differ from properties listed below. Some algorithms are plain implementations of common-known pseudocode.

## Sorting

| class        | name            | best-case            | average-case         | worst-case      | in-place                       | stable |
| ------------ | --------------- | -------------------- | -------------------- | --------------- | ------------------------------ | ------ |
| insertion    | InsertionSort   | $\Omega(n)$          | $\Theta(n^2)$        | $O(n^2)$        | Yes                            | Yes    |
|              | ShellSort[^1]   | $\Omega(n * log(n))$ | $\Theta(n * log(n))$ | $O(n^2)$        | Yes                            | No     |
| selection    | SelectionSort   | $\Omega(n^2)$        | $\Theta(n^2)$        | $O(n^2)$        | Yes                            | No     |
| exchange     | BubbleSort      | $\Omega(n)$          | $\Theta(n^2)$        | $O(n^2)$        | Yes                            | Yes    |
|              | CombSort[^1]    | $\Omega(n * log(n))$ | $\Theta(n^2/2^p)$    | $O(n^2)$        | Yes                            | No     |
|              | CocktailSort    | $\Omega(n)$          | $\Theta(n^2)$        | $O(n^2)$        | Yes                            | Yes    |
|              | QuickSort       | $\Omega(n * log(n))$ | $\Theta(n * log(n))$ | $O(n^2)$        | Yes                            | No     |
|              | GnomeSort       | $\Omega(n)$          | $\Theta(n^2)$        | $O(n^2)$        | Yes                            | Yes    |
|              | BogoSort        | $\Omega(n)$          | $\Theta(n * n!)$     | $infinitly$     | Yes                            | No     |
| merge        | MergeSort       | $\Omega(n * log(n))$ | $\Theta(n * log(n))$ | $O(n * log(n))$ | No (uses auxillary storage)    | Yes    |
| distribution | CountingSort    | $\Omega(n+k)$        | $\Theta(n+k)$        | $O(n+k)$        | No (uses auxillary storage)    | Yes    |
|              | BucketSort      | $\Omega(n+b)$        | $\Theta(n+b)$        | $O(n^2)$        | No (uses auxillary storage)    | No     |
| concurrent   | BitonicSort[^2] | $\Omega(log^2(n))$   | $\Theta(log^2(n))$   | $O(log^2(n))$   | No (depends on implementation) | No     |
| hybrid       |                 |                      |                      |                 |                                |        |
| other        | PancakeSort     |                      | $\Theta(n^2)$        | $O(n^2)$        | Yes                            | No     |

|     | description                     |
| --- | ------------------------------- |
| $k$ | the range of the input interval |
| $b$ | the number of buckets           |
| $p$ | the number of increments        |

## Searching

| class | name         | best-case   | average-case       | worst-case    |
| ----- | ------------ | ----------- | ------------------ | ------------- |
|       | LinearSearch | $\Omega(1)$ | $\Theta(n)$        | $O(n)$        |
|       | BinarySearch | $\Omega(1)$ | $\Theta(log(n))$   | $O(log(n))$   |
|       | JumpSearch   | $\Omega(1)$ | $\Theta(\sqrt{n})$ | $O(\sqrt{n})$ |

[^1]: Strictly, depends on gap sequence/ size.
[^2]: Denoted is the delay within the network of $O(n * log^2(n))$ comparators.
