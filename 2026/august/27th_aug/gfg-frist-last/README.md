# First and Last in Sorted
 
🔗 **Problem:** [\[Problem Link\]](https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1)

---

## Approach 

1. Just like Binary search run 2 binary searches here with diff conditions
2. To get left bound we must get last must occ by moving hi = mid - 1 on condn arr[mid] >= target
3. To get right bound condn should be arr[mid] <= target then lo = mid+1 
4. Thats it while adding in and just check whether ele equals then add in ans


## Complexity

- **Time:** O(log(n))
- **Space:** O(1) 


## Solution
 

The complete solution  is available in [`solution.java`](./solution.java).
