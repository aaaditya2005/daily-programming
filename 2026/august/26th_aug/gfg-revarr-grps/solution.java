class Solution {
    public void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void reverseInGroups(int[] arr, int k) {
        // code here
        if(k==1) return ;
        if(k>=arr.length){
            reverse(arr,0,arr.length-1);
            return;
        }
        int x = arr.length % k;
        int a = 0;
        for(int i = 1;i<=arr.length/k;i++){
            reverse(arr,a,a+k-1);
            a = a+k;
        }
        reverse(arr,a,arr.length-1);
        return;
    }
}