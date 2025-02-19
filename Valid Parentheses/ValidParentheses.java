class Solution {
    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                characterStack.push(c);
            } else {
                if (characterStack.isEmpty()) { return false; }
                char popItem = characterStack.pop();
                if (c == ')') {
                    if (popItem != '(') { return false; }
                } else if (c == '}') {
                    if (popItem != '{') { return false; }
                } else {
                    if (popItem != '[') { return false; }
                }
            }
        }
        return characterStack.isEmpty();
        
    }
}
