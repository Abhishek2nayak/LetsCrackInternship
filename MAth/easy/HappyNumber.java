package MAth.easy;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int origSum = ((n + 1) * n )/ 2;
        int sum = 0;
        for(int num : nums) sum+= num;
        return origSum - sum;
    }
}