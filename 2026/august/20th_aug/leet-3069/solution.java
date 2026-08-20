class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int i =2;
        l1.add(nums[0]);
        l2.add(nums[1]);
        while(i<n){
            if(l1.getLast()>l2.getLast()) l1.add(nums[i++]);
            else l2.add(nums[i++]);
        }
        i = 0;
        for(int ele: l1) ans[i++] = ele;
        for(int ele: l2) ans[i++] = ele;
        return ans;
    }
}