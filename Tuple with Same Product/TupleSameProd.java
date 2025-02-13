class Solution {
    public int tupleSameProduct(int[] nums) {
        int count = 0;
        Map<Integer, Integer> productCountMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productCountMap.put(product, productCountMap.getOrDefault(product, 0) + 1);
            }
        }

        for (int product : productCountMap.keySet()) {
            int pairs = productCountMap.get(product);
           
            count += (pairs * (pairs - 1)) / 2;
        }

        return count * 8;  
        }
 
}
