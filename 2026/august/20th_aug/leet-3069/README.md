# 3069. Distribute Elements Into Two Arrays I
 
🔗 **Problem:** [\[Problem Link\]](https://leetcode.com/problems/distribute-elements-into-two-arrays-i/description/)

---

## Approach 1 - Simple Brute Force

1. Make one ans arrays and 2 arraylist to separate given array as per conditions
2. Based on conditon while travesing over nums put ele in lists
3. At end merge two lists into single array and return it

## Complexity

- **Time:** O(n)
- **Space:** O(n) 


## Approach 2 - Two pointer approach

1. Make oe result ans array and initialize 2 points at end and start of nums and two int last1 and last2 on nums[0] and nums[n-1] to track last ele of both lists
2. Run a for loop from 2nd idc to last and based on contion comparing last1 and last2 we add ele at start and end and reduce or incr the indexes
3. After loop ans array is filled with ans but second half is filled inreverse order as we were filling from last indx so reverse second half of ans and return it


---

## Complexity

- **Time:** O(n)
- **Space:** O(n)  ( Although space complexity is same but auxillary space req for lists is reduced in thsi approach)

---

## Solution

The complete solution 1 is available in [`solution.java`](./solution.java).

The complete solution 2 is available in [`solution.java`](./solution2.java).