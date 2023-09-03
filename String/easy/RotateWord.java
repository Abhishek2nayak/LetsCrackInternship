package String.easy;
class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int n = s.length();
        int i = 0;
        while(i < n ) {
            if(s.charAt(i) != ' ') {
                int j = i;
                while(j < n) {
                    if(s.charAt(j) == ' ') break;
                    j++;
                } 

                ans = " " + s.substring(i,j) + ans;
                i = j;
            } else {
                i++;
            }
        }
        return ans.substring(1);
    }
}