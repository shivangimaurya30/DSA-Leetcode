class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] ch = s.toCharArray(); 
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!isVowel(ch[start])) {
                start++;
                continue;
            }
            if (!isVowel(ch[end])) {
                end--;
                continue;
            }
            // Swap vowels
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
        return new String(ch);
    }

    // Corrected isVowel method
    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
