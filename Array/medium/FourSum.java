package Array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length - 1;

        if (target < 0) {
            if (nums[0] > 0)
                return list;
        }

        if (target > 0) {
            if (nums[n] < 0)
                return list;
        }

        int low, high;

        for (int i = 0; i < n - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } else {
                for (int j = n; j > i; j--) {
                    if (j < n && nums[j] == nums[j + 1]) {
                        continue;
                    } else {
                        low = i + 1;
                        high = j - 1;
                        while (low < high) {
                            long sum = nums[i];
                            sum += nums[j];
                            sum += nums[low];
                            sum += nums[high];
                            if (sum == target) {
                                list.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                                low++;
                                while (low < high && nums[low] == nums[low - 1]) {
                                    low++;
                                }
                                high--;
                                while (low < high && nums[high] == nums[high + 1]) {
                                    high--;
                                }
                            } else if (sum > target) {
                                high--;
                            } else {
                                low++;
                            }
                        }
                    }
                }
            }
        }
        return list;
    }
}