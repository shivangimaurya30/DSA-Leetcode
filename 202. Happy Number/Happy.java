class Solution {
    public boolean isHappy(int n) {
        // Set<Integer> usedInt=new HashSet<>();
        // while(true){
        //     int sum=0;
        //     while(n!=0){
        //         sum+=Math.pow(n%10,2.0);
        //         n=n/10;
        //         // int digit = n % 10;
        //         // sum += digit * digit;

        //     }
        //     if(sum==1) return true;
        //     n=sum;
        //     if(usedInt.contains(n))
        //     return false;
        //     usedInt.add(n);
        // }
        
        while(n!=1 && n!=4){
            int cur=n;
            int sum=0;
            while(cur>0){
                int digit=cur%10;
                sum+=digit*digit;
                cur=cur/10;
            }
            n=sum;
        }
        return n==1;
    }
}
