package Accenture;

public class Day10 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<bestBuy){
                bestBuy = prices[i];
            }
            int profit = prices[i]-bestBuy;

            if (profit>maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
