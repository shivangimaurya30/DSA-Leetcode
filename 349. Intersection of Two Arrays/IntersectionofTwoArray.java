class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
             Set<Integer> set = new HashSet<>();
        for (int num:nums1) set.add(num);
        Set<Integer> rst=new HashSet<>();
        for (int num:nums2) {
            if (set.contains(num)) rst.add(num);
        }
        int i=0;
        int[] result=new int[rst.size()];
        for (int num:rst) result[i++]=num;
        return result;
    }
}
