class MinStack {
    Stack<Integer> values = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        values.push(val);
        if (min.isEmpty()){
            min.push(val);
        }else {
            min.push(Math.min(min.peek(), val));
        }
    }
    
    public void pop() {
        if (!values.isEmpty()){
            values.pop();
            min.pop();
        }
    }
    
    public int top() {
        return values.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
