package MAth.easy;

class Solution {
    public int reverse(int x) {
        long ans = helper(x);
        if (ans < (-1) * Math.pow(2, 31) || ans >= Math.pow(2, 31))
            return 0;
        return (int) ans;
    }

    public long helper(int n) {
        long ans = 0;
        while (n != 0) {
            int r = n % 10;
            ans = ans * 10 + r;
            n /= 10;
        }
        return ans;
    }
}