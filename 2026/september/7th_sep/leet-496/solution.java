class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int i = nums2.length-1;
        st.push(nums2[i--]);
        map.put(nums2[i+1],-1);
        while(st.size()!=0 && i>=0){
            int top = st.peek();
            while(st.size()>0 && st.peek() <= nums2[i]) st.pop();
            if(st.size()==0){
                st.push(nums2[i--]);
                map.put(nums2[i+1],-1);
            }else{
                map.put(nums2[i],st.peek());
                st.push(nums2[i--]);
            }
        }
        int[] ans = new int[nums1.length];
        i = 0;
        while(i<nums1.length){
             ans[i] = map.get(nums1[i]);
             i++;
        }
        return ans;
    }
}