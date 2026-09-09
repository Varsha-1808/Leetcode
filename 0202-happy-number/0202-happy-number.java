class Solution {
    public boolean isHappy(int n) {
        int rem=0,sum=0;
        HashSet<Integer> set=new HashSet<>();

        if(n<=0){
            return false;
        }
       while(n!=1){
               if (set.contains(n)) {
                return false;
            }

            set.add(n);

            sum = 0;

            while (n != 0) {
                rem = n % 10;
                sum += rem * rem;
                n /= 10;
            }

            n = sum;
        }
            return true;
        
    }
}