class MyStack {
    Queue<Integer>first;
    Queue<Integer>second;

    public MyStack() {
       first=new LinkedList<>();
       second=new LinkedList<>();
        
    }
    
    public void push(int x) {
       if (first.isEmpty()) {
            first.add(x);
            while (!second.isEmpty()) {
                first.add(second.poll());
            }
        } else {
            second.add(x);
            while (!first.isEmpty()) {
                second.add(first.poll());
            }
        } 
    }
    
    public int pop() {
        if (first.isEmpty()) {
            return second.poll();
        } else {
            return first.poll();
        }
        
    }
    
    public int top() {
          if (first.isEmpty()) {
            return second.peek();
        } else {
            return first.peek();
        }
        
    }
    
    public boolean empty() {
      return first.isEmpty() && second.isEmpty(); 
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
