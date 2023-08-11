package Array.easy;
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int zeros = 0;
        for(int num : nums) {
            if(num == 0) zeros++;
        }
        int slow = 0;
        int fast = 0;
        while(fast < n) {
            if(nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
            fast++; 
        }
        for(int i = slow; i < n; i++) {
            nums[i] = 0;
        }

    }
}