class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> arr=new HashSet<>();
        for(int i: candyType){
            arr.add(i);
        }
        int n=candyType.length;
        n/=2;
        if(arr.size()<=n){
            return arr.size();
        }
        return n;
    }
}