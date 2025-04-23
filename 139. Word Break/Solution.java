class Solution {
    private Boolean[] memo;
    public boolean wordBreak(String s, List<String> wordDict) {
    memo=new Boolean[s.length()];
    return canBreak(s,0,new HashSet<>(wordDict));
    }
    private boolean canBreak(String s, int idx, Set<String> wordSet) {
        if (idx==s.length()) return true;
        if (memo[idx]!=null) return memo[idx];
        for (int end=idx+1;end<=s.length();end++) {
            String prefix=s.substring(idx,end);
            if (wordSet.contains(prefix)&&canBreak(s,end,wordSet)) {
                return memo[idx]=true;
            }
        }
        return memo[idx]=false;
    }
}
