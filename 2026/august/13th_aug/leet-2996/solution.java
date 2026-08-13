class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums) set.add(ele);

        int j= 1;
        int maxlen = 0;
        int sum = nums[0];
        while(j<nums.length){
            if(nums[j]==nums[j-1]+1){
                sum += nums[j];
                maxlen++;
                j++;
            }else break;
        }
        while(set.contains(sum)) sum++;
        return sum; 
    }
}