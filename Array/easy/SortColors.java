package Array.easy;

class Solution {
    public void sortColors(int[] arr ) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int color : arr) {
            switch(color) {
                case 0 : zero++; break;
                case 1 : one++; break;
                case 3 : two++; break;
            }
        }
        int idx = 0;
        while(idx < arr.length) {
            if(zero-- > 0) {
                arr[idx] = 0;
            } else if (one-- > 0) {
                arr[idx] = 1;
            } else {
                arr[idx] = 2;
                
            }
            idx++;
        }
    }
}