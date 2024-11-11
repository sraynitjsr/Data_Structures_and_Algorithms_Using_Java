# Array-Based Techniques in DSA

### 1. **Sliding Window**
   - **What it is**: Efficiently calculates or tracks values over a subarray by maintaining a "window" that slides through the array.
   - **When to use**: When you need to solve problems involving contiguous subarrays, such as finding the maximum sum of a subarray of fixed length or the longest subarray with certain properties.

### 2. **Prefix Sum**
   - **What it is**: Precomputes cumulative sums of an array to enable efficient range sum queries.
   - **When to use**: When you need to perform multiple range sum queries over a static array.

### 3. **Two Pointers**
   - **What it is**: Uses two pointers to traverse an array in a controlled manner, often to solve problems involving pairs or subarrays.
   - **When to use**: When solving problems like finding pairs that sum to a target, checking for duplicates, or partitioning arrays (e.g., for sorting or partitioning problems).

### 4. **Binary Search**
   - **What it is**: An efficient searching technique for sorted arrays that divides the search space in half at each step.
   - **When to use**: When searching for an element in a sorted array or when you need to find a threshold (like the first occurrence of a number or the smallest element greater than a target).

### 5. **Divide and Conquer**
   - **What it is**: Breaks a problem into smaller subproblems, solves them recursively, and combines their solutions, used in sorting algorithms like Merge Sort and Quick Sort.
   - **When to use**: When a problem can be broken down into smaller independent subproblems that can be solved recursively and combined efficiently.

### 6. **Dynamic Programming (with Array Storage)**
   - **What it is**: Stores intermediate results in an array to optimize recursive solutions and avoid redundant calculations.
   - **When to use**: When solving optimization problems that require breaking down into overlapping subproblems, such as in the case of the Fibonacci sequence, knapsack problems, and longest common subsequence.

### 7. **Hashing with Arrays**
   - **What it is**: Uses hash tables or similar data structures alongside arrays for fast lookups, often to track frequencies or detect duplicates.
   - **When to use**: When you need to track frequencies of elements, detect duplicates, or quickly look up values in an array.

### 8. **Heap (Priority Queue) Using Arrays**
   - **What it is**: A binary heap implemented using an array, often used for efficiently finding the k-th largest element or implementing priority queues.
   - **When to use**: When you need to repeatedly access the largest or smallest element, such as in scheduling tasks or finding the k-th largest element.

### 9. **Greedy Algorithms with Arrays**
   - **What it is**: Makes locally optimal choices at each step, often using arrays to store intermediate results, like in activity selection problems.
   - **When to use**: When you need to make a sequence of decisions that result in the globally optimal solution, such as in problems like interval scheduling or coin change with infinite supply.

### 10. **Counting Sort (Non-comparative Sorting)**
    - **What it is**: A linear time sorting algorithm that counts the occurrences of each element, particularly useful for sorting integers within a known range.
    - **When to use**: When you need to sort an array of integers or categorical data within a small and known range, and efficiency is critical.

### 11. **Kadane's Algorithm**
    - **What it is**: An algorithm to find the maximum sum subarray in an array in linear time using dynamic programming.
    - **When to use**: When you need to find the contiguous subarray with the largest sum, especially in problems like the "Maximum Subarray Problem".
