# Pythagorean Triplet


 
🔗 **Problem:** [\[Problem Link\]](https://www.geeksforgeeks.org/problems/pythagorean-triplet3018/1)

---

## Approach 

1. Find the maxele from arr and make freq array of size maxele + 1 and store freq of ele
2. Then run a for loop from i = 0 to maxele + 1 and if freq[i] = 0 skip that iteration
3. Then run a for loop from j = i to end and if freq[j]=0 skip thatiteration also
4. Inside loop now calc sq = i*i + j*j then store the sqRoot(sq) in 'c'
5. Now directly if(freq[c]>0) return true but c*c = sq and c <= maxele


## Complexity

- **Time:** O(max2)
- **Space:** O(max) 


## Solution
 

The complete solution  is available in [`solution.java`](./solution.java).
