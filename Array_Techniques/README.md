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

### 12. **Binary Indexed Tree (Fenwick Tree)**
   - **What it is**: A data structure that allows for efficient updates and prefix sum queries, typically implemented using arrays.
   - **When to use**: When you need to perform frequent updates and queries on cumulative sums or other range queries in an array, with a time complexity of \(O(\log n)\).

### 13. **Mo's Algorithm (Offline Query Optimization)**
   - **What it is**: A square root decomposition technique used to answer range queries efficiently by sorting the queries in a specific order.
   - **When to use**: When you need to answer multiple range queries over an array in \(O((N + Q) \sqrt{N})\) time, where \(N\) is the size of the array and \(Q\) is the number of queries.

### 14. **Sparse Table**
   - **What it is**: A preprocessing technique that allows for constant time range queries on static arrays (e.g., range minimum query or range greatest common divisor).
   - **When to use**: When you need to answer range queries on a static array efficiently after preprocessing it in \(O(N \log N)\), particularly for queries like minimum, maximum, or greatest common divisor.

### 15. **Union-Find (Disjoint Set Union - DSU)**
   - **What it is**: A data structure that supports the efficient union of sets and finding the representative of an element, often used for dynamic connectivity problems.
   - **When to use**: When you need to perform union and find operations on disjoint sets, such as in graph connectivity problems (e.g., Kruskal’s MST algorithm or dynamic connectivity queries).

### 16. **Rotating an Array**
   - **What it is**: A technique for rotating elements of an array by a certain number of positions, either left or right.
   - **When to use**: When you need to perform operations that require rotating the elements of an array, for example, when working with circular buffers or problems like rotating an array in place.

### 17. **Three-way Partitioning**
   - **What it is**: A technique to divide an array into three segments based on a pivot (e.g., in the Dutch National Flag problem).
   - **When to use**: When you need to partition an array into three groups, such as sorting elements around a pivot in the quicksort algorithm or solving problems with multiple distinct categories (e.g., sorting colors or rearranging elements).

### 18. **Kadane’s Algorithm for Maximum Product Subarray**
   - **What it is**: A modification of Kadane's algorithm that finds the contiguous subarray with the maximum product.
   - **When to use**: When you need to find the maximum product subarray in an array, which is a variation of the maximum sum subarray problem.

### 19. **Reservoir Sampling**
   - **What it is**: A technique used to randomly sample \(k\) elements from a stream or an array of unknown size.
   - **When to use**: When you need to sample from a large dataset or stream where the size is not known in advance, and you want to ensure each element has an equal probability of being chosen.

### 20. **Binary Search on Answer (Optimization)**
   - **What it is**: A technique where binary search is applied on the solution space (i.e., the answer) rather than the array itself.
   - **When to use**: When the problem has a decision function that can be binary-searched, such as in problems where you need to find the smallest or largest value that satisfies certain conditions (e.g., finding the minimum number of moves to reach a certain target).

### 21. **Z-Algorithm (Pattern Matching)**
   - **What it is**: A linear time algorithm used to find all occurrences of a pattern in a string or array.
   - **When to use**: When you need to perform efficient pattern matching, such as searching for all occurrences of a substring or a pattern within a string or array.

### 22. **Ternary Search**
   - **What it is**: A searching algorithm that divides the search space into three parts, used for finding the maximum or minimum of a unimodal function.
   - **When to use**: When you need to find the maximum or minimum value of a unimodal function (i.e., a function that is either entirely non-increasing or non-decreasing).

### 23. **Segment Tree**
   - **What it is**: A tree data structure that allows for efficient range queries and updates on an array, such as sum, minimum, or maximum queries.
   - **When to use**: When you need to perform multiple range queries and updates efficiently on a static or dynamic array, with a time complexity of \(O(\log n)\).

### 24. **LIS (Longest Increasing Subsequence)**
   - **What it is**: A dynamic programming technique to find the longest subsequence of an array where the elements are strictly increasing.
   - **When to use**: When you need to find the length of the longest increasing subsequence in an array, often used in problems like stock price prediction or longest common subsequence.

### 25. **Prefix Product Array**
   - **What it is**: Precomputes the product of all elements before each index in an array to allow for efficient queries on subarray products.
   - **When to use**: When you need to compute products of elements in subarrays or perform range product queries efficiently.
