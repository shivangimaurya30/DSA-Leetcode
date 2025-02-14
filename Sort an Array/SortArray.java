class Solution {
    public int[] sortArray(int[] nums) {
        int start=0;
        int end= nums.length-1;
        mergesort(nums,start,end);
        

        return nums;
    }
    public void mergesort(int[] nums,int start,int end){

        if(start==end){
            return;
        }
        int mid= (start+end)/2;
        mergesort(nums,start,mid);
        mergesort(nums,mid+1,end);
        merge(nums,start,mid,end);

       

    }
    public void merge(int[] nums,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
            }else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k]=nums[i];
            i++;
            k++;

        }
         while(j<=end){
            temp[k]=nums[j];
            j++;
            k++;

        }
        for(k=0,i=start;k<temp.length;i++,k++){
            nums[i]=temp[k];
    }
    }
}
