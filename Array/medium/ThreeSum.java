package Array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length - 1;
        int low, high;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } else {
                low = i + 1;
                high = n;
                while (low < high) {
                    int sum = nums[low] + nums[high] + nums[i];
                    if (sum == 0) {
                        list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        low++;
                        while (low < high && nums[low - 1] == nums[low]) {
                            low++;
                        }
                    } else if (sum > 0) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return list;

    }
}