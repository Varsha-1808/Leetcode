class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
       ArrayList<Integer> arr=new ArrayList<>();
       for(int i=0;i<stones.length;i++){
        arr.add(stones[i]);
       }
       int x=0,y=0,f=0;
       for(int i=0;i<stones.length;i++){
        if(arr.size()>1){
            Collections.sort(arr,Collections.reverseOrder());
             x=arr.get(0);
             y=arr.get(1);
            if(x>y){
              int temp=x;
              x=y;
              y=temp;
            }

            if(x==y){
                arr.remove(Integer.valueOf(x));
                arr.remove(Integer.valueOf(y));
            }

            else if(x!=y){
                arr.remove(Integer.valueOf(x));
                y=y-x;
                arr.set(0,y);
            }
        }
        else{
            break;
        }
       }
       if(arr.size()==1){
        return arr.get(0);
       }
       return 0;
    }
}