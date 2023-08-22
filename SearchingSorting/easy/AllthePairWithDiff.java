package SearchingSorting.easy;

import java.util.Arrays;

class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        
        for(int i = 0; i < size; i++) {
            int l = i + 1;
            int h = size -1;
            while(l <= h) {
                int m = l + (h - l)/ 2;
                int diff = Math.abs(arr[m] - arr[i]);
                if(diff == n) {
                    return true;
                } else if(diff < n) {
                    l = m + 1;
                } else {
                    h = m -1;
                }
            }
        }
        return  false;
    }
}