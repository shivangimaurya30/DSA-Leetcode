class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> result=new ArrayList<>();
        if (num==null||num.length()==0) return result;
        backtrack(result,new StringBuilder(),num,target,0,0,0);
        return result;
    }
    private void backtrack(List<String> res,StringBuilder path,String num,int target, int index, long calc, long tail) {
        if (index == num.length()) {
            if (calc == target) {
                res.add(path.toString());
            }
            return;
        }
        for (int i = index; i < num.length(); i++) {
            if (i != index && num.charAt(index) == '0') break;
            String currStr = num.substring(index, i + 1);
            long curr = Long.parseLong(currStr);
            int len = path.length();
            if (index == 0) {
                path.append(currStr);
                backtrack(res, path, num, target, i + 1, curr, curr);
                path.setLength(len);  
            } else {
                path.append("+").append(currStr);
                backtrack(res, path, num, target, i + 1, calc + curr, curr);
                path.setLength(len);
                path.append("-").append(currStr);
                backtrack(res, path, num, target, i + 1, calc - curr, -curr);
                path.setLength(len);
                path.append("*").append(currStr);
                backtrack(res, path, num, target, i + 1, calc - tail + tail * curr, tail * curr);
                path.setLength(len);
            }
        }
    }
}
