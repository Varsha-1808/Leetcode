class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        else if(n==1){
            return true;
        }
        int q=0;
        while(n%2==0){
          q=n/2;
          if(q==1){
             return true;
          }
          n=q;
        }
        return false;
    }
}