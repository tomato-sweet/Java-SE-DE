public class MinStack {
    public MinStack() {
    }
    public void push(int x) {
        left.push(x);
            if(right.empty() || x <= right.top()){
                right.push(x);
            }
    }
    public void pop() {
        int top = left.top();
        left.pop();
        if(top == right.top()){
            right.pop();
        }
    }
    public int top() {
        return left.pop();
    }
    public int getMin() {
        return right.top();
    }
    private stack<Integer> left;//存正长数据
    private stack<Integer> right;//存最小数据
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */