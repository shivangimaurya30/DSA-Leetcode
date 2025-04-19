class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits==null||digits.length()==0) {
            return result;
        }
        
        Map<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");
        
        backtrack(result,phoneMap,digits,0,new StringBuilder());
        
        return result;
    }
private void backtrack(List<String> result,Map<Character, String>phoneMap,String digits,int index,StringBuilder combination) {
        if (index==digits.length()) {
            result.add(combination.toString());
            return;
        }
        
        String letters=phoneMap.get(digits.charAt(index));
        for (int i=0;i<letters.length();i++) {
            combination.append(letters.charAt(i));
            backtrack(result,phoneMap,digits,index+1,combination);
            combination.deleteCharAt(combination.length()-1);
        }
    }
}
