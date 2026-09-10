class MyStack {
    Queue<Integer> qt;
    public MyStack() {
        qt = new LinkedList<>();
    }
    
    public void push(int x) {
        qt.offer(x);
        for(int i = qt.size() - 1 ; i > 0 ; i--){
            qt.offer(qt.poll());
        }
    }
    
    public int pop() {
        return qt.poll();
    }
    
    public int top() {
        return qt.peek();
    }
    
    public boolean empty() {
        return qt.size() == 0;
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