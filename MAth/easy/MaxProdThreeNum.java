package MAth.easy;

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        //sort the array
        Arrays.sort(nums);
        
        int n = nums.length;
        System.out.println(nums[n-1]);
        if(nums[n -1] < 0 ||nums[0] >= 0 ) return nums[n-1] * nums[n-2] * nums[n-3];

        return Math.max(nums[0] * nums[1] * nums[n-1],nums[n-1] * nums[n-2] * nums[n-3]);
        
    }
}