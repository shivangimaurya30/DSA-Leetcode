class Solution {
    public boolean checkPerfectNumber(int num) {
       int total=0;
        if (num<=0)
         return false;
        for (int i=1;i<=num/2;++i) {
            if (num%i==0) {
                total+=i;
            }
        }
        System.out.println(total);
        if(total==num){
        return true;
        }
        else 
        {
            return false;
        }
    }
}
