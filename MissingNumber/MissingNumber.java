class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
         int l=nums.length;
        for(int i=0;i<l;i++){
            sum=sum+nums[i];
        }
        int actualSum = l*(l+1)/2 ;
        int missNum= actualSum - sum;
        return missNum;
    }
    
}
