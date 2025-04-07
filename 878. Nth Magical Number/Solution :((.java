class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        // int ans=0;
        // int i=1;int num=2;
        // while(i<=n){
        //     if(num%a==0|| num%b==0){
        //         if(i==n){
        //             ans=num;
        //              break;
        //         }
        //         i++;
        //     }
        //     num++;
        // }
        // return ans;
       
       //optimize :binary search
    
        long A=a,B=b;
        long mod=(long)(Math.pow(10,9)+7);
        long left=Math.min(a,b);
        long right=(long)n*Math.min(a,b);
        while (B>0) {
            long temp=A;
            A=B;
            B=temp%B;
        }
        long lcm = ((long)a*b)/A;
        while (left<right){
            long mid=left+(right-left)/2;
            if ((mid/a)+(mid/b)-(mid/lcm)<n){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return (int)(left%mod);
    }
}
