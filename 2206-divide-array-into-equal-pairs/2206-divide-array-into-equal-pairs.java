class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2!=0){
            return false;
        }
        HashSet<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        HashMap<Integer,Integer> arr=new HashMap<>();
            for(int i: s){
                int c=0;
                for(int j=0;j<nums.length;j++){
                    if(i==nums[j]){
                        c++;
                    }
                }
                arr.put(i,c);
            }
            int t=0;
            for (int value : arr.values()) {
                  if(value%2==0){
                       t++;
                }
            }
        
        if(t==arr.size()){
            return true;
        }
        return false;
    }
}