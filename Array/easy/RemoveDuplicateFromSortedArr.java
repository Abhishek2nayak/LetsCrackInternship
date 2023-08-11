package Array.easy;

class Solution {
    public int removeDuplicates(int[] nums) {

        //we can use two pointer approach to solve this problem
        //because array is already sorted we can take two pointer
        
       int slow = 0;
       int fast = 1;
       while(fast  < nums.length) {
           if(nums[slow] == nums[fast]) {
           } else {
               nums[++slow] = nums[fast];
           }
           fast++;
       } 

       return slow + 1;
    }
}