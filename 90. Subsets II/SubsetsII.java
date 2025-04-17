class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ss=new HashSet<>();
        for (int i=0;i<(1<<nums.length);i++){
            int j=i;
            int n=0;
            ArrayList<Integer> s = new ArrayList<Integer>();
            System.out.println(i);
            while(j!=0){
                if ((j&1)==1){
                    s.add(nums[n]);
                }
                j>>=1;
                n++;
            }
            ss.add(s);
        }
        return new ArrayList<>(ss);
    }
}
