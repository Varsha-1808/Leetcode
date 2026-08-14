class Solution {
    public List<String> summaryRanges(int[] nums) {
       ArrayList<String> arr=new ArrayList<>();
       int j=0;
       if (nums.length == 0) {
            return arr;
        }
        int t=nums[0];
       for(int i=0;i<nums.length;i++){
        if(t==nums[i]){
            t++;
            continue;
        }
        else{
            if(nums[j]==nums[i-1]){
                arr.add(String.valueOf(nums[i-1]));
            }
            else{
            arr.add(nums[j]+"->"+nums[i-1]);
            }
            j=i;
            t=nums[i]+1;
        }
       }
       if(nums[j]==nums[nums.length-1]){
                arr.add(String.valueOf(nums[nums.length-1]));
            }
            else{
            arr.add(nums[j]+"->"+nums[nums.length-1]);
            }
       return arr;
    }
}