class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int sum=0;
        int left=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                sum=Math.max(sum,i-left);
            }else{
                left=i;
            }
        }
        return sum;

        
    }
}
