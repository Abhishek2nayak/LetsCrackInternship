package Array.medium;

class Solution {
    public int majorityElement(int[] nums) {
        // Using Bit Manipulation
        int majoriy_element = 0;
        for (int i = 0; i < 32; i++) {
            int bit = 1 << i;
            int bitCount = 0;
            for (int num : nums) {
                if ((bit & num) != 0)
                    bitCount++;

            }
            if (bitCount > (nums.length / 2)) {
                // execute when majority is set bit
                // so we have to increment our ans
                majoriy_element |= bit;
            }
        }
        return majoriy_element;
    }
}