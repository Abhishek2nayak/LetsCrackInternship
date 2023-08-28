package StackQueue.easy;

import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];

        // for loop for num1
        int idx = 0;
        for (int num : nums1) {
            Stack<Integer> s = new Stack<>();
            for (int i = nums2.length - 1; i >= 0; i--) {
                // if our stack is empty
                if (s.empty())
                    s.push(nums2[i]);

                // if nums1 == nums2
                if (num == nums2[i]) {

                    // System.out.println(nums2[i]);
                    while (!s.empty() && s.peek() <= num) {
                        s.pop();
                    }

                    if (s.empty()) {
                        ans[idx] = -1;
                    } else {
                        ans[idx] = s.peek();
                    }

                    break;

                } else {

                    while (!s.empty() && s.peek() < nums2[i]) {
                        s.pop();
                    }

                    s.push(nums2[i]);

                }
            }
            idx++;
        }

        return ans;

    }
}
