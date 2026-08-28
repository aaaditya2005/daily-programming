class Solution {
    public void rearrange(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int max_idx = n - 1;
        int min_idx = 0;
        long max_element = arr[n - 1] + 1;

        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                arr[i] += (arr[max_idx] % max_element) * max_element;
                max_idx--;
            } 
            else{
                arr[i] += (arr[min_idx] % max_element) * max_element;
                min_idx++;
            }
        }

        for (int i = 0; i < n; i++) arr[i] /= max_element;
    }
}
