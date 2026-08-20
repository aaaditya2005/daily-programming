class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int a = 0;
        int b = n - 1;
        
        ans[a++] = nums[0];
        ans[b--] = nums[1];
        int last1 = nums[0];
        int last2 = nums[1];
        for (int i =2;i<n;i++) {
            if(last1 > last2){
                ans[a++] = nums[i];
                last1 = nums[i];
            }else{
                ans[b--] = nums[i]; 
                last2 = nums[i];
            }
        }

        int start = b+1;
        int end = n-1;
         while (start < end) {
            int temp = ans[start];
            ans[start] = ans[end];
            ans[end] = temp;
            start++;
            end--;
        }
        return ans;
    }
}