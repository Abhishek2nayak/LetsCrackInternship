package MAth.easy;


class Solution {
    public int helper(int[] nums) {

       int min = nums[0];
       for(int num : nums) min = Math.min(min,num);
       int ans = 0;
       for(int num : nums) ans += num - min;
       return ans;

    }
    public int minMoves(int[] nums) {

        return helper(nums);
    }

}