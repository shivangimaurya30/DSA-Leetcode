class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currSum=0,low=0,high=0;
        int minLenWindow=Integer.MAX_VALUE;
        for(high=0;high<nums.length;high++){
            currSum+=nums[high];
            while(currSum>=target){
                int currWindow=high-low+1;
                minLenWindow=Math.min(minLenWindow,currWindow);
                currSum-=nums[low];
                low++;
            }
        }
      return  minLenWindow==Integer.MAX_VALUE?0:minLenWindow;  
        
    }
}
