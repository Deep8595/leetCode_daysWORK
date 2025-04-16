Coding Question Here.

| Q.No. | Topic / Description                                                                 | LeetCode Problem Name (if available)                            | LeetCode ID |
|-------|--------------------------------------------------------------------------------------|------------------------------------------------------------------|-------------|
| 2     | Sum in range using prefix sum array                                                  | Range Sum Query – Immutable                                      | 303         |
| 3     | Equilibrium index in an array                                                        | Find Pivot Index                                                 | 724         |
| 4     | Check if array can be split into equal prefix and suffix sum                         | Split Array Into Two Equal Sum Subarrays                         | —           |
| 5     | Max sum of any subarray of size K                                                    | Maximum Average Subarray I                                       | 643         |
| 6     | Longest substring without repeating characters                                       | Longest Substring Without Repeating Characters                  | 3           |
| 8     | Longest palindromic substring                                                        | Longest Palindromic Substring                                    | 5           |
| 9     | Longest common prefix among strings                                                  | Longest Common Prefix                                            | 14          |
| 10    | Generate all permutations of a string                                                | Permutations                                                     | 46          |
| 11    | Two numbers in sorted array that add to target                                       | Two Sum II – Input Array Is Sorted                               | 167         |
| 12    | Next lexicographical permutation                                                     | Next Permutation                                                 | 31          |
| 13    | Merge two sorted linked lists                                                        | Merge Two Sorted Lists                                           | 21          |
| 14    | Median of two sorted arrays                                                          | Median of Two Sorted Arrays                                      | 4           |
| 15    | K-th smallest element in a sorted matrix                                             | Kth Smallest Element in a Sorted Matrix                          | 378         |
| 16    | Majority element (appears more than n/2 times)                                       | Majority Element                                                 | 169         |
| 17    | Water trapped between histogram bars                                                 | Trapping Rain Water                                              | 42          |
| 18    | Maximum XOR of two numbers in array                                                  | Maximum XOR of Two Numbers in an Array                           | 421         |
| 19    | Maximum product subarray                                                              | Maximum Product Subarray                                         | 152         |
| 20    | Count numbers with unique digits                                                     | Count Numbers with Unique Digits                                 | 357         |
| 21    | Count number of 1s in binary from 0 to n                                              | Counting Bits                                                    | 338         |
| 22    | Check if number is power of two using bit manipulation                               | Power of Two                                                     | 231         |
| 23    | Maximum XOR of two numbers (repeated of Q18)                                         | Duplicate of Q18                                                 | 421         |
| 25    | Next greater element for each element                                                | Next Greater Element I                                           | 496         |
| 26    | Remove n-th node from end of linked list                                              | Remove Nth Node From End of List                                 | 19          |
| 27    | Node where two singly linked lists intersect                                          | Intersection of Two Linked Lists                                 | 160         |
| 28    | Implement two stacks in a single array                                                | Design a Two Stack Data Structure (Conceptual)                   | —           |
| 29    | Check if integer is a palindrome (without string)                                    | Palindrome Number                                                | 9           |
| 31    | Max in every sliding window of size K using deque                                     | Sliding Window Maximum                                           | 239         |
| 32    | Largest rectangle in histogram                                                       | Largest Rectangle in Histogram                                   | 84          |
| 34    | Subarray sum equals K using hashing                                                  | Subarray Sum Equals K                                            | 560         |
| 35    | K-most frequent elements using priority queue                                        | Top K Frequent Elements                                          | 347         |
| 36    | Generate all subsets of array                                                        | Subsets                                                          | 78          |
| 37    | Unique combinations summing to target                                                | Combination Sum                                                  | 39          |
| 38    | Generate all permutations of array                                                   | Permutations                                                     | 46          |
| 40    | Element with maximum frequency in array                                              | Sort Characters by Frequency (similar concept)                   | 451         |
| 41    | Max subarray sum using Kadane's algorithm                                            | Maximum Subarray                                                 | 53          |
| 43    | Top K frequent elements in an array                                                  | Top K Frequent Elements                                          | 347         |
| 44    | Two numbers add up to target using hashing                                           | Two Sum                                                          | 1           |
| 46    | Longest palindromic substring (repeated of Q8)                                       | Duplicate of Q8                                                  | 5           |
| 48    | Next permutation of array (repeated of Q12)                                          | Duplicate of Q12                                                 | 31          |
| 49    | Intersection of two linked lists (repeated of Q27)                                   | Duplicate of Q27                                                 | 160         |

Theory Question Here.

1. Explain the concept of a prefix sum array and its applications??

A prefix sum array is a derived array where each element at index `i` is the sum of all elements from index `0` to `i` in the original array. Formally, if `A` is the original array, then the prefix sum array `P` is defined as:
- `P[0] = A[0]`
- `P[i] = P[i-1] + A[i]` for all `i > 0`

Applications:
- Efficient range sum queries: Once the prefix sum is precomputed, sum of any subarray from index `L` to `R` can be found in constant time using `P[R] - P[L-1]`.
- Equilibrium index problems.
- Subarray sum problems.
- Sliding window optimizations.
- Binary Indexed Tree (Fenwick Tree) and Segment Tree concepts use prefix sums implicitly.

---

2. Explain the sliding window technique and its use in string problems??

The sliding window technique involves creating a window (usually a subarray or substring) which moves over the data structure (like an array or string) to examine subsets of data. This technique is especially useful when dealing with contiguous data elements and helps reduce time complexity.

Usage in String Problems:
- Finding the longest substring without repeating characters.
- Anagrams in a string.
- Minimum window substring problems.
- Pattern matching and frequency analysis.

Advantages:
- Optimizes brute-force O(n²) solutions to linear or linearithmic time.
- Keeps track of data dynamically using pointers or hash maps.

---

3. Explain the concept of bit manipulation and its advantages in algorithm design??

Bit manipulation involves using bitwise operators (`&, |, ^, ~, <<, >>`) to perform operations at the binary level. It allows for fast and memory-efficient operations.

Advantages:
- Efficient storage: Multiple boolean flags can be packed into a single integer.
- Speed: Bitwise operations are faster than arithmetic operations.
- Solving problems like:
  - Checking if a number is a power of two.
  - Counting set bits.
  - Finding the unique element in an array with duplicates.
  - Subset generation using bitmasking.

Common Tricks:
- `n & (n - 1)` removes the lowest set bit (used to count set bits).
- `n & 1` checks if a number is odd.
- Bitwise XOR is used to find unique numbers.

---

4. Explain the concept of linked lists and their applications in algorithm design??

A linked list is a linear data structure in which elements (nodes) point to the next node using pointers. Unlike arrays, memory is not stored contiguously.

Types:
- Singly Linked List
- Doubly Linked List
- Circular Linked List

Applications:
- Efficient insertions/deletions from any position (especially head and tail).
- Used in stacks, queues, graphs, adjacency lists.
- Implementation of hash tables with chaining.
- Efficient memory usage compared to arrays when data size is unknown.

---

5. Explain the sliding window technique and its applications in array problems??

Sliding window in arrays works similarly to strings—it involves two pointers that define the current window. This window "slides" as conditions are met.
  
Common Array Applications:
- Maximum/minimum subarray sum of size K.
- Counting subarrays with a certain property.
- Detecting averages or medians in a moving window.

Benefits:
- Avoids recomputation for overlapping subarrays.
- Converts nested loops into linear-time logic.

---

6. Explain the difference between subsets and permutations with examples??

Subsets are selections of elements where order does not matter, and each element is either included or not.

- Example: Subsets of `[1, 2]` → `[ ], [1], [2], [1,2]`
- Number of subsets for `n` elements = `2ⁿ`

Permutations are arrangements of elements where order does matter.

- Example: Permutations of `[1, 2]` → `[1,2], [2,1]`
- Number of permutations for `n` elements = `n!`

Key Differences:
- Subsets: focus on inclusion/exclusion.
- Permutations: focus on arrangement/order.

---
  
7. Explain the concept of dynamic programming and its use in solving the maximum subarray problem??

Dynamic Programming (DP) is a technique to solve problems by breaking them into overlapping subproblems and storing the results to avoid redundant work.

Key Principles:
- Optimal substructure.
- Overlapping subproblems.
- Memoization or tabulation.

In Maximum Subarray Problem:
- Kadane’s Algorithm uses a form of DP:
  - Maintain `current_max` and `global_max`.
  - `current_max = max(current_max + arr[i], arr[i])`
  - `global_max = max(global_max, current_max)`
- This reduces the time complexity to O(n).

---

8. Explain the concept of priority queues and their applications in algorithm design??

A Priority Queue is an abstract data type where each element has a priority, and elements are served based on their priority (highest or lowest first), not just the order of insertion.

Implementations:
- Binary Heap (min-heap or max-heap).
- Fibonacci Heap (for advanced applications).

Applications:
- Dijkstra’s algorithm for shortest path.
- Huffman coding.
- Job scheduling.
- Merging K sorted lists.
- Real-time task execution.

---

9. Explain the concept of histogram problems and their applications in algorithm design??

Histogram problems deal with heights of bars and are often modeled as arrays. The most common problem is finding the **largest rectangle area** under the histogram.

Algorithm Techniques:
- Stack-based solution to track indices of bars.
- Divide and conquer.

Applications:
- Maximum area problems.
- Used as a base problem for matrix subrectangle maximums.
- Applied in image processing and skyline problems.

---

10. Explain the concept of equilibrium index and its applications in array problems??

An equilibrium index in an array is an index such that the sum of elements at lower indices is equal to the sum of elements at higher indices.

Formal Definition:
- For index `i`, `sum(0 to i-1) == sum(i+1 to n-1)`

Applications:
- Array balancing problems.
- Useful in algorithm interviews to test prefix sum knowledge.
- Helps in performance analysis, load balancing.

Efficient Approach:
- Use prefix sum of total array.
- Iterate and at each index calculate `left_sum` and derive `right_sum = total - left_sum - arr[i]`

---
