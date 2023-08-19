package MAth.easy;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0 ) return false;
        if(n == 1) return true;
        int temp = (int) (Math.log(n)/Math.log(2));
        
        return n == Math.pow(2,temp);
    }
}