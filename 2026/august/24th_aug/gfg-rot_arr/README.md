# Rotate Array
 
🔗 **Problem:** [\[Problem Link\]](https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1)

---

## Approach 1 - brute force

1. Run a while loop over d ut before make d = d%n thereafter in loop
2. store first ele in temp and then traverse over a arry from oth to n-1th idx and just put next ele in curr ele and at end put temp in nth ele


## Complexity

- **Time:** O(n*d)
- **Space:** O(1) 

## Approach 2

1. make d = d%n thereafter rev first n-d ele then after rev last d ele and thne rev whole array will get ans array



## Complexity

- **Time:** O(n)
- **Space:** O(1) 



## Solution
 

The complete solution  is available in [`solution.java`](./solution.java).
The complete solution  is available in [`solution2.java`](./solution2.java).