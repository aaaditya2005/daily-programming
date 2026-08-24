class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        if(n==1) return;
        d = d%n;
        while(d!=0){
            int temp = arr[0];
            int i = 0;
            while(i<n-1){
                arr[i] = arr[i+1];
                i++;
            }
            arr[i] = temp;
            d--;
        }
        
        return ;
    }
}