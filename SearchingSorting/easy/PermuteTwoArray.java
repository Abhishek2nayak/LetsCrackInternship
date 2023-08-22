package SearchingSorting.easy;

import java.util.Arrays;

class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
      
      Arrays.sort(a);
      int l = 0;
      int h = n-1;
      while(l < h) {
          long temp = a[l];
          a[l] = a[h];
          a[h] = temp;
          l++;
          h--;
      }

    Arrays.sort(b);
        for(int i = 0; i < n; i++) {
            if(a[i] + b[i] < k) return false;
        }
        return true;
    }
}