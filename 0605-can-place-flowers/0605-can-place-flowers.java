class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        if(flowerbed[0]==0 && flowerbed.length==1){
           return true;
        }
        for(int i=0;i<flowerbed.length-1+1;i++){
            if(i==0){
                 if(flowerbed[i]==0 && flowerbed[i+1]==0){
                    c++;
                    flowerbed[i]=1;
                 }
            }
              else if(i==flowerbed.length-1){
                if(flowerbed[i-1]==0 && flowerbed[i]==0){
                    c++;
                    flowerbed[i]=1;
                }
            }
            else if(flowerbed[i-1]==0 && flowerbed[i+1]==0 &&flowerbed[i]==0){
                c++;
                flowerbed[i]=1;
            }
        }
        if(n<=c){
            return true;
        }
        return false;
    }
}