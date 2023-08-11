package Array.easy;

class Solution {
    public int maxProfit(int[] prices) {
        // first : we have to find min price to buy stock
        int idx = 0;
        int buy = 0;
        int profit = 0;
        int n = prices.length;
        while (idx < n - 1) {
            if (prices[idx] > prices[idx + 1]) {
                idx++;
            } else {
                buy = idx;
                break;
            }
        }
        if (idx == n)
            return 0;
        idx++;

        while (idx < n) {
            int currProfit = prices[idx] - prices[buy];
            if (prices[idx] < prices[buy]) {
                buy = idx;
            }
            if (currProfit > profit)
                profit = currProfit;
            idx++;
        }

        return profit;

    }
}