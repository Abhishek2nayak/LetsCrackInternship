package Array.medium;

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int low =0;
        int high = n -1;
        while(low < high) {
            int crrVolume = (high - low) * (Math.min(height[low],height[high]));
            if(crrVolume > max) max = crrVolume;

            if(height[low] > height[high]) {
                high--;
            } else {
                low++;
            }
        }
       return max;
    }
}