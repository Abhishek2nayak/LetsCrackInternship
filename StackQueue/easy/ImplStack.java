package StackQueue.easy;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        Queue<Integer> temp = new LinkedList<>();
        int ans = 0;
        while (q.peek() != null) {
            int ele = q.poll();
            if (q.peek() == null) {
                ans = ele;
            } else {
                temp.add(ele);
            }
        }
        while (temp.peek() != null) {
            int ele = temp.poll();

            q.add(ele);
        }

        return ans;
    }

    public int top() {
        Queue<Integer> temp = new LinkedList<>();
        int ans = 0;
        while (q.peek() != null) {
            int ele = q.poll();
            if (q.peek() == null) {
                ans = ele;
            }
            temp.add(ele);

        }
        while (temp.peek() != null) {
            int ele = temp.poll();

            q.add(ele);
        }

        return ans;
    }

    public boolean empty() {
        if (q.peek() == null)
            return true;
        return false;
    }
}
