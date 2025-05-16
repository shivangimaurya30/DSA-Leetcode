class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(asteroids[i]);
                continue;
            }
            else{
                if(asteroids[i]<0 && st.peek()>0){
                    while(!st.isEmpty() &&asteroids[i]<0 && st.peek()>0){
                        if(Math.abs(asteroids[i])>st.peek()){
                            st.pop();
                        }
                        else if(Math.abs(asteroids[i])==st.peek()){
                            st.pop();
                            asteroids[i]=0;
                            break;
                        }
                        else{
                            asteroids[i]=0;
                            break;
                        }
                    }
                    if(asteroids[i]!=0){
                        st.push(asteroids[i]);
                    }                    
                }
                else{
                    st.push(asteroids[i]);
                    continue;
                }
            }
        }
        int [] arr=new int[st.size()];
        int idx=0;
        for(int i:st){
            arr[idx]=i;
            idx++;
        }
        return arr;
    }
}
