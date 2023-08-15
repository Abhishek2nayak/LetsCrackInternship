package String.easy;

class Solution {
    public boolean validPalindrome(String s) {
       int l = 0;
       int h = s.length() -1;
       while(l <= h) {
           if(s.charAt(l) == s.charAt(h)) {
               l++;
               h--;
           } else {
               return isRemainPalind(s,l + 1,h) || isRemainPalind(s,l,h-1); 
           }
       }
       return true;
    }
    public boolean isRemainPalind(String s, int l , int h) {
         while(l <= h) {
           if(s.charAt(l) == s.charAt(h)) {
               l++;
               h--;
           } else {
               return false; 
           }
       }
       return true;
    }
}
