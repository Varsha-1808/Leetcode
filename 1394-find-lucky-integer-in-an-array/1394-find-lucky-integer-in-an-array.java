class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            map.put(arr[i],c);
        }
        int max=0,f=0;
        for (int key : map.keySet()) {
              if (key == map.get(key)) {
                    if(key>max){
                        max=key;
                        f=1;
                    }
                }
            }
            if(f==1){
                return max;
            }
        return -1;
    }
}