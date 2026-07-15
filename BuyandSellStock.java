import java.util.HashMap;

public class BuyandSellStock {
    public static void main() {
        int[] prices = {5, 1, 2, 3, 0, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int start = 0;
        int end = start + 1;
        int ans = 0;
        while (start < prices.length - 1 && end<prices.length) {
            if (prices[start] <= prices[end]) {
                if (ans<prices[end]-prices[start]){
                    ans = prices[end]-prices[start];
                }
                end++;
            } else if (prices[start] >= prices[end]) {
                start = end;
                end++;
            }
        }
        return ans;
    }
}
