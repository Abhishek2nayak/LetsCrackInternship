package Array.medium;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        for(int num : nums) sum += num;
        int count = 0;
        for(int i = 0; i < nums.length ; i++) {
            int temp = sum;
            
            for(int j= nums.length -1; j >= i; j--) {
               
                if(temp == k) count++;
                 temp = temp - nums[j];
            }   
            sum -= nums[i];
        }
        return count;
    }
}