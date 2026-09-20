class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
              if(nums[i]==nums[j]){
                arr.add(nums[j]);
              }
            }
        }
        HashSet<Integer> s=new HashSet<>();
        int sum=0;
        for(int i:nums){
            s.add(i);
        }
        for(int k: s){
            sum=sum+k;
        }
        for(int l: arr){
            sum-=l;
        }
        return sum;
    }
}