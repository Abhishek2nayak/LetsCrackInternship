package String.easy;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int idx = 0;
       for(int i = 0 ; i < strs[0].length(); i++) {
           char c = strs[0].charAt(i);
           for(int j = 0; j < strs.length; j++) {
               if(i >= strs[j].length() || c != strs[j].charAt(i)) return ans;
           }
           ans += c;
       }
        return ans;

    }
}