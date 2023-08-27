package StackQueue.easy;

import java.util.Stack;

class MyQueue {

    Stack<Integer> s;

    public MyQueue() {
        s = new Stack<>();
    }

    public void push(int x) {
        s.push(x);
    }

    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while (!s.empty()) {
            temp.push(s.pop());
        }
        int ans = temp.pop();
        while (!temp.empty()) {
            s.push(temp.pop());
        }

        return ans;

    }

    public int peek() {

        Stack<Integer> temp = new Stack<>();
        while (!s.empty()) {
            temp.push(s.pop());
        }
        int ans = temp.peek();
        while (!temp.empty()) {
            s.push(temp.pop());
        }

        return ans;
    }

    public boolean empty() {
        if (s.empty())
            return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */