class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        helper(1,k,0,n,ans,temp);
        return ans;
        
    }
    private void helper(int i,int k,int sum,int n,List<List<Integer>>ans, List<Integer>temp){
        if(sum==n&&k==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum>n||k<0){
            return;
        }
        for(int j=i;j<=9;j++){
    if(j>n) break;
    temp.add(j);
    helper(j+1, k-1,sum+j, n,ans,temp);
    temp.remove(temp.size()-1);//backtrack
}  
  }
}
