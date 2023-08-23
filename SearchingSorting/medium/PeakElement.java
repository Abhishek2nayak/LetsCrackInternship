package SearchingSorting.medium;

class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if(n == 1) return 0;
        
        int low = 0;
        int high = n -1;
        while(low < high) {
            int m = low + (high - low) / 2;
            if(arr[m] < arr[m + 1]) {
                low = m  + 1;
            } else {
                high = m;
            }
        }

        return low;
    }
}