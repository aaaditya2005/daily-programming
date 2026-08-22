class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[arr.length-1]);
        
        int rightMax = arr[arr.length-1];
        for(int i =arr.length-2;i>=0;i--){
            if(arr[i] >= rightMax){
                ans.add(0,arr[i]);
                rightMax = arr[i];
            }
        }
        
        return ans;
    }
}
