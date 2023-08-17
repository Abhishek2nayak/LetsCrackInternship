package Array.medium;

class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1 && nums[0] == 0)
            return true;
        return findRoute(nums, 0, nums[0]);
        
    }

    public boolean findRoute(int[] nums, int start, int end) {

        if (end >= nums.length - 1)
            return true;
        boolean ans = false;
        for (int i = start; i <= end; i++) {
            int maxIdx = max(nums, start, end);
            if (nums[maxIdx] == 0) {
                return false;
            }
            ans = findRoute(nums, maxIdx + 1, maxIdx + nums[maxIdx]);
            if (!ans) {
                nums[maxIdx] = -1;
            } else {
                return true;
            }
        }
        return ans;

    }

    public int max(int[] nums, int l, int h) {
        int m = l;
        for (int i = l + 1; i <= h; i++) {
            if (nums[m] <= nums[i])
                m = i;
        }
        return m;
    }
}