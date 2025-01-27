class Solution {
    public void rotate(int[] nums, int k) {
        k= k % nums.length;
        reverse(nums,0,nums.length-1); //[7,6,5,4,3,2,1]
        reverse(nums,0,k-1); //[5,6,7,4,3,2,1]
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] arr,int start,int end){
        while(start <end){   //start =0, end =7
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end++;
        }
    }
}
