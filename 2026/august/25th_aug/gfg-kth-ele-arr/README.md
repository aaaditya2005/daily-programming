# K-th element of two Arraysn
 
🔗 **Problem:** [\[Problem Link\]](https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1)

---

## Approach 

1. create 3 pointers(i,j,l) at a[0],b[0] and 3rd as virtual final combined sorted array 0th idx
2. travel over the pointers while one of it reaches the end
3. At each turn check which ele is smaller and increment the idx of that ele also l++ and but before i+++/j++ check whether l==k is yes return the smaller ele; 


## Complexity

- **Time:** O(n)
- **Space:** O(1) 


## Solution
 

The complete solution  is available in [`solution.java`](./solution.java).
