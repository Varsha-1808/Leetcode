class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int f=0,t=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                max=nums[i];
                t=i;
            }
            arr.add(2*nums[i]);
        }
        arr.remove(t);
        for(int i=0;i<arr.size();i++)
        {
            if(max >= arr.get(i)){
                f=0;
            }
            else {
                f=1;
                break;
            }
        }
        if(f==1){
            return -1;
        }
        return t; 
  }
}