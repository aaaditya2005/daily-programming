class Solution {
    public void reverse(int arr[], int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        if(n==1) return;
        d = d%n;
        reverse(arr, 0, n-d);
        reverse(arr, n-d, n-1);
        reverse(arr, 0, n-1);
        
        return ;
    }
}