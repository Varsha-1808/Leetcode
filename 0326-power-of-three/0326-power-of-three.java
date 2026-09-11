class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        else if(n==1){
            return true;
        }
        int q=0;
        while(n%3==0){
            q=n/3;
            if(q==1){
                return true;
            }
            n=q;
        }
        return false;
    }
}