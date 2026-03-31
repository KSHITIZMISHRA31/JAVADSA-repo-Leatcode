# 🧠 Java DSA — LeetCode Problems & Data Structures

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![DSA](https://img.shields.io/badge/DSA-Data%20Structures%20%26%20Algorithms-blue?style=for-the-badge)
![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)

> A Java-based repository for practicing **Data Structures**, solving **LeetCode problems**, and exploring both **brute force** and **optimized approaches** to algorithmic challenges.

---

## 📁 Project Structure

```
JAVADSA-repo-Leatcode/
│
├── src/
│   └── main/
│       └── java/
│           └── org/
│               ├── arrays/           # Array-based problems
│               ├── strings/          # String manipulation
│               ├── linkedlist/       # Linked list implementations
│               ├── stack/            # Stack problems
│               ├── queue/            # Queue problems
│               ├── trees/            # Binary trees & BST
│               ├── graphs/           # Graph algorithms
│               ├── hashing/          # HashMap & HashSet problems
│               ├── sorting/          # Sorting algorithms
│               ├── recursion/        # Recursion & backtracking
│               ├── dp/               # Dynamic Programming
│               └── searching/        # Binary search problems
│
├── pom.xml                           # Maven build config
└── README.md
```

---

## 🗂️ Data Structures Covered

### 1. 📦 Arrays
> Fixed-size, index-based, contiguous memory storage.

| Concept | Description |
|---------|-------------|
| Traversal | Iterate using index or enhanced for-loop |
| Two Pointers | Left & right pointer technique |
| Sliding Window | Fixed/variable window over subarrays |
| Prefix Sum | Precompute cumulative sums for range queries |
| Kadane's Algorithm | Maximum subarray sum in O(n) |

**Common LeetCode Patterns:**
- Find duplicates, rotate array, merge sorted arrays
- Subarray sum equals K, product of array except self
- Move zeroes, best time to buy & sell stock

---

### 2. 🔤 Strings
> Immutable sequence of characters in Java.

| Concept | Description |
|---------|-------------|
| Anagram Check | Sort or frequency map comparison |
| Palindrome | Two-pointer check |
| Sliding Window | Longest substring without repeating chars |
| StringBuilder | Efficient string manipulation |

**Common LeetCode Patterns:**
- Valid anagram, reverse words, longest palindromic substring
- String compression, first unique character, Roman to Integer

---

### 3. 🔗 Linked List

```
Singly:   HEAD → [1] → [2] → [3] → null
Doubly:   null ← [1] ↔ [2] ↔ [3] → null
Circular: HEAD → [1] → [2] → [3] → (back to HEAD)
```

| Operation | Time Complexity |
|-----------|----------------|
| Access | O(n) |
| Search | O(n) |
| Insert (head) | O(1) |
| Delete (known node) | O(1) |

**Common LeetCode Patterns:**
- Reverse a linked list, detect cycle (Floyd's algorithm)
- Merge two sorted lists, find middle node
- Remove N-th node from end, palindrome linked list

---

### 4. 📚 Stack
> LIFO (Last In, First Out) — implemented via `Stack` or `Deque`.

```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(1);         // push
int top = stack.peek(); // peek
stack.pop();           // pop
```

**Common LeetCode Patterns:**
- Valid parentheses, min stack
- Next greater element, daily temperatures
- Evaluate reverse polish notation, largest rectangle in histogram

---

### 5. 🎫 Queue & Deque
> FIFO (First In, First Out) — implemented via `LinkedList` or `ArrayDeque`.

```java
Queue<Integer> queue = new LinkedList<>();
queue.offer(1);        // enqueue
int front = queue.peek(); // peek
queue.poll();          // dequeue
```

**Common LeetCode Patterns:**
- Binary tree level order traversal (BFS)
- Sliding window maximum (Monotonic Deque)
- Rotting oranges, number of islands

---

### 6. 🌳 Trees

```
        1          ← Root
       / \
      2   3        ← Internal Nodes
     / \
    4   5          ← Leaf Nodes
```

| Traversal | Order | Use Case |
|-----------|-------|----------|
| Inorder | Left → Root → Right | BST sorted output |
| Preorder | Root → Left → Right | Copy/clone a tree |
| Postorder | Left → Right → Root | Delete a tree |
| Level Order | BFS row by row | Shortest path in tree |

**Common LeetCode Patterns:**
- Maximum depth, diameter of binary tree
- Lowest common ancestor, path sum
- Validate BST, serialize & deserialize binary tree
- Invert binary tree, symmetric tree

---

### 7. 🕸️ Graphs

| Representation | Best For |
|----------------|----------|
| Adjacency Matrix | Dense graphs, O(1) edge lookup |
| Adjacency List | Sparse graphs, space-efficient |

**Traversal Algorithms:**

```
BFS (Breadth-First Search)  → uses Queue  → shortest path in unweighted graph
DFS (Depth-First Search)    → uses Stack/Recursion → cycle detection, topological sort
```

**Common LeetCode Patterns:**
- Number of islands, clone graph
- Course schedule (topological sort / cycle detection)
- Shortest path in binary matrix, word ladder
- Pacific Atlantic water flow

---

### 8. #️⃣ Hashing

```java
HashMap<String, Integer> map = new HashMap<>();
map.put("apple", 1);
map.getOrDefault("banana", 0); // safe get
map.containsKey("apple");
```

**Common LeetCode Patterns:**
- Two Sum, group anagrams
- Longest consecutive sequence
- Subarray sum equals K, top K frequent elements
- LRU Cache (LinkedHashMap)

---

### 9. 🏔️ Heap / Priority Queue

```java
// Min-Heap
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

// Max-Heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
```

**Common LeetCode Patterns:**
- Kth largest/smallest element
- Merge K sorted lists
- Top K frequent elements, find median from data stream

---

## ⚙️ Algorithms Covered

### 🔍 Searching

| Algorithm | Time | Space | Notes |
|-----------|------|-------|-------|
| Linear Search | O(n) | O(1) | Works on unsorted |
| Binary Search | O(log n) | O(1) | Requires sorted array |

**Binary Search Variants:**
- Find first/last position of element
- Search in rotated sorted array
- Find peak element, sqrt(x)

---

### 📊 Sorting

| Algorithm | Best | Average | Worst | Stable |
|-----------|------|---------|-------|--------|
| Bubble Sort | O(n) | O(n²) | O(n²) | ✅ |
| Selection Sort | O(n²) | O(n²) | O(n²) | ❌ |
| Insertion Sort | O(n) | O(n²) | O(n²) | ✅ |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | ✅ |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | ❌ |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | ❌ |

---

### 🔁 Recursion & Backtracking

> Explore all possibilities by making choices and undoing them (backtrack) if they don't work.

```java
void backtrack(List<List<Integer>> result, List<Integer> current, int start, int[] nums) {
    result.add(new ArrayList<>(current));
    for (int i = start; i < nums.length; i++) {
        current.add(nums[i]);
        backtrack(result, current, i + 1, nums);
        current.remove(current.size() - 1); // undo choice
    }
}
```

**Common LeetCode Patterns:**
- Subsets, permutations, combinations
- N-Queens, Sudoku solver, word search
- Letter combinations of a phone number

---

### 💡 Dynamic Programming

> Break a problem into overlapping subproblems; store results to avoid recomputation.

**Approaches:**
- **Top-Down (Memoization):** Recursion + cache
- **Bottom-Up (Tabulation):** Iterative + DP table

| Pattern | Example Problems |
|---------|-----------------|
| 1D DP | Climbing Stairs, House Robber, Fibonacci |
| 2D DP | Longest Common Subsequence, Edit Distance |
| Knapsack | 0/1 Knapsack, Coin Change, Partition Equal Subset Sum |
| String DP | Palindromic Substrings, Wildcard Matching |
| Matrix DP | Unique Paths, Minimum Path Sum |

---

## 🧪 Problem-Solving Approach

For each LeetCode problem in this repository, the solution follows this structure:

```
Problem: [LeetCode #number — Problem Name]
Difficulty: Easy / Medium / Hard
--------------------------------------------
Brute Force:
  - Approach: ...
  - Time Complexity: O(?)
  - Space Complexity: O(?)

Optimized:
  - Approach: ...
  - Time Complexity: O(?)
  - Space Complexity: O(?)
```

---

## 📈 Complexity Quick Reference

| Notation | Name | Example |
|----------|------|---------|
| O(1) | Constant | Array access, HashMap get |
| O(log n) | Logarithmic | Binary search |
| O(n) | Linear | Single loop |
| O(n log n) | Linearithmic | Merge sort |
| O(n²) | Quadratic | Nested loops |
| O(2ⁿ) | Exponential | Recursive subsets |
| O(n!) | Factorial | Permutations |

---

## 🚀 Getting Started

### Prerequisites
- Java JDK 8 or above
- Maven 3.x
- IntelliJ IDEA / Eclipse / VS Code

### Clone & Build

```bash
# Clone the repository
git clone https://github.com/KSHITIZMISHRA31/JAVADSA-repo-Leatcode.git
cd JAVADSA-repo-Leatcode

# Build with Maven
mvn clean install

# Run a specific class
mvn exec:java -Dexec.mainClass="org.arrays.TwoSum"
```

### Run Directly

```bash
# Compile manually
javac src/main/java/org/arrays/TwoSum.java

# Run
java -cp src/main/java org.arrays.TwoSum
```

---

## 🗺️ LeetCode Topic Roadmap

```
📌 Start Here
│
├── ✅ Arrays & Strings         ← Foundation
├── ✅ HashMap & HashSet        ← Fast lookups
├── ✅ Two Pointers             ← Reduce O(n²) to O(n)
├── ✅ Sliding Window           ← Subarray problems
├── ✅ Binary Search            ← O(log n) searching
├── ✅ Stack & Queue            ← Order-based problems
├── ✅ Linked List              ← Pointer manipulation
├── ✅ Recursion & Backtracking ← Explore all paths
├── ✅ Trees & BST              ← Hierarchical data
├── ✅ Graphs (BFS/DFS)         ← Network traversal
├── ✅ Dynamic Programming      ← Optimization problems
└── ✅ Heap / Priority Queue    ← Top-K problems
```

---

## 🛠️ Tech Stack

- **Language**: Java (JDK 8+)
- **Build Tool**: Apache Maven
- **IDE**: IntelliJ IDEA
- **Platform**: [LeetCode](https://leetcode.com)

---

## 📚 Resources

- [LeetCode](https://leetcode.com) — Practice problems
- [NeetCode Roadmap](https://neetcode.io/roadmap) — Structured DSA roadmap
- [Visualgo](https://visualgo.net) — Visual algorithm animations
- [Big-O Cheat Sheet](https://www.bigocheatsheet.com) — Complexity reference
- [GeeksForGeeks](https://www.geeksforgeeks.org) — DSA tutorials

---

## 👤 Author

**Kshitiz Mishra**
- GitHub: [@KSHITIZMISHRA31](https://github.com/KSHITIZMISHRA31)
- LeetCode: [Profile](https://leetcode.com)

---

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

> ⭐ If this repo helped you, consider giving it a star — it motivates me to keep adding more solutions!
