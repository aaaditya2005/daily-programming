class Solution {
    ArrayList<Integer> find(int arr[], int target) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);

        int left = 0;
        int right = n - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] >= target) right = mid - 1;
            else left = mid + 1;
        
        }

        if (left < n && arr[left] == target) ans.set(0,left);
        else return ans; 

        right = n - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] <= target) left = mid + 1;
            else right = mid - 1;
            
        }

        ans.set(1,right);
        return ans;
    }
}
