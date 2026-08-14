# 3090. Maximum Length Substring With Two Occurrences
 
🔗 **Problem:** [\[Problem Link\]](https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/description/)

---

## Approach 1

1. Run a for loop from idx 0 to length - 1 of string
2. Use HashMap inside loop to store the char and freq of char of current substring
3. Run another roop inside main loop from ith idx to length of string
4. while in inner loop track freq of chars and if current chars freq become above 2 then break inner loop as this substring is not req one else increment Currsize then size =  max(Currsize and size)

## Complexity

- **Time:** O(n2)
- **Space:** O(1)


## Approach 2

1. At first use array of size 26 to store freq of chars using asci values and index i at 0 as left char
2. Run a loop form 0th idx to last of string as this idx act as right char
3. In each turn increment the freq of right char in array
4. After increment run while loop until the curr chars freq is less than 2 and reduce its freq in array and i++
5. At end of for loop calc size by max(size,j-i+1)

---

## Complexity

- **Time:** O(n)
- **Space:** O(1)

---

## Solution

The complete solution is available in [`solution.java`](./solution.java).