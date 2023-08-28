package StackQueue.easy;

import java.util.*;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = helper(s);
        Stack<Character> s2 = helper(t);

        while (!s1.empty() && !s2.empty()) {
            char c1 = s1.pop();
            char c2 = s2.pop();
            if (c1 != c2)
                return false;
        }

        if (!s1.empty() || !s2.empty())
            return false;
        return true;
    }

    public Stack<Character> helper(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#' && (!stack.empty())) {
                stack.pop();
            } else if (c != '#') {
                stack.push(c);
            }
        }

        return stack;
    }
}