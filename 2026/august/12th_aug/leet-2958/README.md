# 2958. Length of Longest Subarray With at Most K Frequency
 
🔗 **Problem:** [\[Problem Link\]](https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/)

---

## Approach


1. Here sliding window can be used to change the array window to get desired subarray
2. At each time when window grows we cheack whether freq of nums[j] <= k or not if not then we reduce size of window till we get freq k
3. And for each j after reduction of window we will put ans = max(ans,windowsize)

---

## Complexity

- **Time:** O(n)
- **Space:** O(n)

---

## Solution

The complete solution is available in [`solution.java`](./solution.java).