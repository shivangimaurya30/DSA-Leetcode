class Solution {
    public int maximumWealth(int[][] accounts) {
          
          int ans=Integer.MIN_VALUE;
          for(int r=0;r<accounts.length;r++){
            int sum=0;
            for(int col=0;col<accounts[r].length;col++){
                sum+=accounts[r][col];
            }
                if(sum>ans){
                    ans=sum;
                }
            }
            return ans;
          }
    }
