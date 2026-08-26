# Reverse Array in Groups
 
🔗 **Problem:** [\[Problem Link\]](https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1)

---

## Approach 

1. Make a function to rev array with inputs arr, start and end
2. In main func write base conditions for k==1 and k>len
3. Now run a loop for len/k time and each time rev array of k window using var a outside of for loop and a = a+k each iteration
4. after loop if ele rem in array at end rev that too rev(arr,a,len-1);


## Complexity

- **Time:** O(n)
- **Space:** O(1) 


## Solution
 

The complete solution  is available in [`solution.java`](./solution.java).
