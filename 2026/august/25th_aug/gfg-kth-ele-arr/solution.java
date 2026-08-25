class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i = 0,j=0,l=0;
        while(i<a.length && j<b.length){
            if(a[i]>=b[j]){
                l++;
                if(l==k) return b[j];
                j++;
            }else{
                l++;
                if(l==k) return a[i];
                i++;
            }
        }
        while(i<a.length){
            l++;
            if(l==k) return a[i];
            i++;
        }
        
        while(j<b.length){
            l++;
            if(l==k) return b[j];
            j++;
        }
        return -1;
    }
}