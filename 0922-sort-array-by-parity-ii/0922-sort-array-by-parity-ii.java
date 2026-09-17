class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int []arr=new int[nums.length];
        int []o=new int[nums.length/2];
        int []e=new int[nums.length/2];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                e[b]=nums[i];
                b++;
            }
            else{
                o[a]=nums[i];
                a++;
            }
        }
        int x=0,y=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=e[x];
                x++;
            }
            else{
                arr[i]=o[y];
                y++;
            }
        }
        return arr;
    }
}