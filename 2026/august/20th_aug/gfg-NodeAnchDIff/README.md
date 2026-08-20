# Node and Ancestor Max Diff
 
🔗 **Problem:** [\[Problem Link\]](https://www.geeksforgeeks.org/problems/maximum-difference-between-node-and-its-ancestor/1)

---

## Approach 

1. Initialize a global variable to track max diff
2. In recursive funtion calc till now max diff between anch - currroot.data and max
3. Then update maxch with comparing current node then again call func for left and right subtree
4. Base will be when root reaches the null returning intmin value

## Complexity

- **Time:** O(n)
- **Space:** O(n) 

---

## Solution

The complete solution  is available in [`solution.java`](./solution.java).

