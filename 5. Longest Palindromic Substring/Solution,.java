class Solution {
    public String longestPalindrome(String s) {
       if (s==null || s.length()<1) 
       return "";
        int n=s.length();
        String longest="";
        for (int i=0;i<n;i++) {
            for (int j=i;j<n;j++) {
                if (isPalindrome(s,i,j) && (j-i+1)>longest.length()) {
                    longest=s.substring(i,j+1);
                }
            }
        }
        return longest;
    }

    private boolean isPalindrome(String s,int start,int end) {
        while (start<end) {
            if (s.charAt(start)!= s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
