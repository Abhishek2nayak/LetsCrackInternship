package Array.medium;

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        if(k == n) return sum;
        int left = k -1;
        int right = n -1;
        int leftSum = 0;
        int rightSum = 0;
        while(k--> 0 && left < right) {
            leftSum += cardPoints[left--];
            rightSum += cardPoints[right--];

            if(leftSum < rightSum) {
                sum -= leftSum;
                sum += rightSum;
                leftSum = 0;
                rightSum = 0;

            }    

        }

        return sum;

    }
}