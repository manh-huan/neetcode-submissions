class MinStack {
    
    Stack<Integer> stack;

    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek(); 
    }
    
    public int getMin() {
        Stack<Integer> tmp = new Stack<>();

        int res = stack.peek();

        while (!stack.isEmpty()) {
            int top = stack.pop();
            res = Math.min(res, top);
            tmp.push(top);
        }

        while(!tmp.empty()) {
            stack.push(tmp.pop());
        }
        return res;
    }
}
