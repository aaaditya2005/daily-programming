# Rearrange Array Alternately

 
🔗 **Problem:** [\[Problem Link\]](https://www.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1)

---

## Approach 

1. Sort the list from smallest to largest so we can grab the biggest numbers from the back and the smallest numbers from the front
2. Then store max and min idx as 0 and n-1 and max ele as arr[n-1] + 1 because
3. To use formula : Divident = (quotient(new value) * divisor(max ele)) + remainder(old value) 
4. So in for loop for idx we do based on odd even idx arr[i] += (arr[max/min_idx] % max_element) * max_element;
5. And to get result as we want we can divide again using for loop all ele by max_ele;


## Complexity

- **Time:** O(nlog(n))
- **Space:** O(1) 


## Solution
 

The complete solution  is available in [`solution.java`](./solution.java).
