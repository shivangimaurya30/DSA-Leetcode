class Solution {
    public int numSubarraysWithSum(int[] nums, int goal){
        // HashMap<Integer, Integer>map=new HashMap<>();
        // map.put(0,1); int prefixSum=0;int count=0;
        // for (int i=0;i<nums.length;i++){
        //     prefixSum+=nums[i];
        //     if (map.containsKey(prefixSum-goal)){
        //         count+=map.get(prefixSum-goal);
        //     }
        //     map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        // }
        // return count;  
        int n=nums.length;
        int[] prefixCount=new int[n+1];
        prefixCount[0]=1;
        int prefixSum=0;int count=0;
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];
            if (prefixSum-goal>=0){
                count+=prefixCount[prefixSum-goal];
            }
            prefixCount[prefixSum]++;
        }
        return count;       
    }
}
