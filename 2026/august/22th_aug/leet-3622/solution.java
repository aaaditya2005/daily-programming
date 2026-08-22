class Solution {
    public boolean checkDivisibility(int n) {
        int digitsum = 0;
        int digitmult = 1;

        int x = n;
        while(x!=0){
            digitsum += x%10;
            digitmult *= x%10;
            x = x/10;
        }

        if(n%(digitsum+digitmult)==0) return true;
        else return false;
    }
}