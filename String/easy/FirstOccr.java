package String.easy;

class Solution {
    public int strStr(String haystack, String needle) {
        
       int n = haystack.length();
       int m = needle.length();

       if(m > n) return -1;
       for(int i =0; i <= n -m ; i++) {
           //if first char are same then we are going to check other character also
           if(haystack.charAt(i) == needle.charAt(0)) {
               int idx1= i;
               int idx2 = 0;
               while(idx2 < m && haystack.charAt(idx1) == needle.charAt(idx2)) {
                   idx2++;
                   idx1++;
               }
               if(idx2 == m) return i;
           }
       }
       return -1;
    }
}