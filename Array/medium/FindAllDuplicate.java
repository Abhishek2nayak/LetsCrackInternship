package Array.medium;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int idx = 0;
        int n = nums.length;
        while (idx < n) {
            if (idx + 1 != nums[idx]) {
                // check for repeated element
                if (nums[idx] != nums[nums[idx] - 1]) {
                    // swap
                    int temp = nums[idx];
                    nums[idx] = nums[temp - 1];
                    nums[temp - 1] = temp;
                    // System.out.println(nums[idx]);
                } else {
                    idx++;
                }
            } else {
                idx++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                list.add(nums[i]);
            }
        }

        return list;

    }
}