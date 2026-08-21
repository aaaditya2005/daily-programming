# Transform String
 
🔗 **Problem:** [\[Problem Link\]](https://www.geeksforgeeks.org/problems/transform-string5648/1)

---

## Approach 1 - Simple Brute Force

1. First to return -1 check lengths of both string then chars and their freq using map
2. Use a 2 pointer approach both starting from end of each string
3. traverse back while i>=0 
4. inside for loop if(s1.char == s1.char) then decrement both by one as it means relative position in both strs same
5. if s1.char != s2.char then only i-- because it means char position is incorrect and it must be shift to begin 
6. Finnaly return j+1 as min op req because from back whenver j decre it means char matched so unmatched on 0 based arrys is j+1


## Complexity

- **Time:** O(n)
- **Space:** O(n) 



## Solution


The complete solution  is available in [`solution.java`](./solution.java).