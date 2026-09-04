class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr =new ArrayList<>();
        boolean [] b=new boolean[nums.length+1];

        for(int i:nums){
            b[i]=true;
        }
        for(int i=1;i<=nums.length;i++){
            if(!b[i]){
                arr.add(i);
            }
        }
        return arr;
        
    }
}