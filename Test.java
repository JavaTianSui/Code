package Day1;

import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> mstack; //辅助栈

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        mstack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
        mstack.push(Math.min(stack.peek(), x));
    }
    
    public void pop() {
        stack.pop();
        mstack.pop();
    }
    
    public int min() {
        return mstack.pop();
    }
    
    public int top() {
       return stack.peek();
    }
}

