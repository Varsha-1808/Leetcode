class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> arr=new ArrayList<>();
        int sum=0;
        arr.add(Integer.parseInt(operations[0]));
        for(int i=1;i<operations.length;i++){
            if(operations[i].equals("D")){
                  arr.add((arr.get(arr.size()-1))*2);
            }
            else if(operations[i].equals("C")){
                arr.remove(arr.size()-1);
            }
            else if(operations[i].equals("+")){
                arr.add((arr.get(arr.size()-1))+(arr.get(arr.size()-2)));
            }
            else{
                arr.add(Integer.parseInt(operations[i]));
            }
        }
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
}