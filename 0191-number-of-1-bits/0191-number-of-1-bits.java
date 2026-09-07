class Solution {
    public int hammingWeight(int n) {
        int []bin=new int[35];
        int id=0;
        while(n>0){
            bin[id++]=n%2;
            n/=2;
        }
        int c=0;
        for(int i:bin){
            if(i==1){
                c++;
            }
        }
        return c;
    }
}