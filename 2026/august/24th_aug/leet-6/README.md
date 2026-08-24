# 6. Zigzag Conversion
 
🔗 **Problem:** [\[Problem Link\]](https://leetcode.com/problems/zigzag-conversion/?envType=problem-list-v2&envId=string)

---

## Approach 

1. Create an array of StringBuilder objects, one for each row, to track the characters placed in that horizontal line.
2. Use a variable to track the current row index and a boolean flag (goingDown) to monitor the vertical direction.
3. Traverse through the string character by character. Append each character to its corresponding row, and reverse the direction (goingDown = !goingDown) whenever you bounce against the top row (0) or the bottom row (numRows - 1).


## Complexity

- **Time:** O(n)
- **Space:** O(n) 


## Solution
 

The complete solution  is available in [`solution.java`](./solution.java).
