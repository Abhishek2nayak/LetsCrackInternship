package Array.easy;

import java.util.HashMap;


/* 
 * Two sum question can easy solved using hashmap
 * expanation : 
 * --> 
 * we known that
 * target = num1 + num2 
 *     num1 = target - num2
 *     or
 *     num2 = target - num1 
 * so if we store one number and check all the pair of givent array
 * by subtracting from targert 
 * then we can easily find our index
 * 1 : we have to iterate whole array
 * 2 : and check if pair exists 
 *   then return the index
 *   else store the curr num in hashMap
 */



class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] idx = {-1,-1};

        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(hash.containsKey(target - nums[i])) {
                idx[0] = hash.get(target - nums[i]);
                idx[1] = i;
                return idx;
            } else {
                hash.put(nums[i],i);
            }
        }

        return idx;
    }
}