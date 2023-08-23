package SearchingSorting.medium;

class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;

        if(n == 1 && target != nums[0]) return -1; 
        // we have to find pivot first 

        int i = 0;
        for(i = 1; i < n; i++) {
            if(nums[i] < nums[i-1]) break;
        }

        System.out.println(i);

        int firstHalf = binarySearch(nums,target,0,i-1);
        if(firstHalf != -1) return firstHalf;

        int secondHalf = binarySearch(nums,target,i, n-1);
        if(secondHalf != -1) return secondHalf;
        return -1;
        


    }
    public int binarySearch(int[] nums, int target, int s, int e) {

        while(s <= e) {
           int m = s + (e - s)/ 2;
            if(nums[m] == target) {
                return m;
            }
            else if(nums[m] < target) {
                s = m + 1;
            } else {
                e = m -1;
            }
        }

        return -1;
    } 


}
