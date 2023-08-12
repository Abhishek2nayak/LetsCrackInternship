package Array.easy;

class Solution {
    public int maxProfit(int[] prices) {
       
       int idx = 0;
       int sell = 0;
       int buy = 0;
       int profit = 0;
        
        //outer loop to iterate all the prices
        int n = prices.length;
        while(idx < n) {
            //to find minimum price to buy stock
            while(idx < n -1 && prices[idx] > prices[idx + 1]) {
              idx++;
            }
            buy = idx;
            //to find maximum price to sell the stock
             while(idx < n -1 && prices[idx] < prices[idx + 1]) {
              idx++;
            }
            sell = idx;
            profit += prices[sell] - prices[buy];
            idx++;

        }
        return profit;
    }
}