package MAth.easy;

class Solution {
    public String addBinary(String a, String b) {

        int n = a.length();
        int m = b.length();
        String ans = "";
        int idx1 = n - 1;
        int idx2 = m - 1;
        int carry = 0;
        while (idx1 >= 0 && idx2 >= 0) {
            int n1 = (int) (a.charAt(idx1) - '0');
            int n2 = (int) (b.charAt(idx2) - '0');
            int s = n1 + n2 + carry;
            ans = (s % 2) + "" + ans;
            carry = s / 2;

            idx1--;
            idx2--;
        }

        while (idx1 >= 0) {
            int n1 = (int) (a.charAt(idx1) - '0');

            int s = n1 + carry;
            ans = (s % 2) + "" + ans;
            carry = s / 2;
            idx1--;

        }
        while (idx2 >= 0) {
            int n2 = (int) (b.charAt(idx2) - '0');

            int s = n2 + carry;
            ans = (s % 2) + "" + ans;
            carry = s / 2;
            idx2--;

        }
        if (carry == 0)
            return ans;
        ans = carry + ans;
        return ans;

    }
}