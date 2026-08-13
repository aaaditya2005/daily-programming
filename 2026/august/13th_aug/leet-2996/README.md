#  2996 Smallest Missing Integer Greater Than Sequential Prefix Sum

 
🔗 **Problem:** [\[Problem Link\]](https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/)

---

## Approach


1. Use HashSet to store all unique ele of nums
2. Then from 0th index find sequence with given condition using while loop along with calc sum
3. After getting sum increment it by one each time until it contains in set

---

## Complexity

- **Time:** O(n)
- **Space:** O(n)

---

## Solution

The complete solution is available in [`solution.java`](./solution.java).