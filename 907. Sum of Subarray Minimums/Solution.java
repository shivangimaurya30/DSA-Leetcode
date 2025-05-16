class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int MOD=1000000007; 
        long result=0;
        int[] prevLess=new int[n]; 
        int[] nextLess=new int[n];
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<n;++i){
            while(!stack.isEmpty() &&arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            prevLess[i]=stack.isEmpty() ?-1:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for (int i=n -1;i>=0;--i){
            while(!stack.isEmpty() &&arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            nextLess[i]=stack.isEmpty() ? n:stack.peek();
            stack.push(i);
        }
        for (int i=0;i<n;++i){
            long left=i-prevLess[i];   
            long right=nextLess[i]-i;  
            long contribution=(arr[i]*left%MOD)*right%MOD;
            result=(result+contribution)%MOD;
        }
        return (int)result;
    }
}
