class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCount=new HashMap<>();
        prefixSumCount.put(0,1); 
        int sum=0;   
        int count=0; 
        for (int num:nums) {
            sum+=num;
            if (prefixSumCount.containsKey(sum-k)) {
                count+=prefixSumCount.get(sum-k);
            }
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum,0)+1);
        }
        return count;
    }
}

