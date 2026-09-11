class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n%4==0){
            int q=n/4;
            if(q==1){
                return true;
            }
            n=q;
        }
        return false;
    }
}