class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod=1_000_000_007;
        int result=0;
        int n=nums.length;
        int[] pow=new int[n];
        pow[0]=1;
        for(int i=1;i<n;i++){
            pow[i]=(pow[i-1]*2)%mod;
        }
        for(int l=0;l<n;l++){
            int r=binarySearch(nums,target-nums[l])-1;
            if(r>=l){
                result+=pow[r-l];
                result%=mod;
            }
        }
        int l=0;
        return result;
    }
    private int binarySearch(int[] nums,int val){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=val){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}
