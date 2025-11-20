public class StockProfit {
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices1)); // Output: 5

        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices2)); // Output: 0
    }
    
}

/*
    PROBLEM SUMMARY:
    You are given an array 'prices' where prices[i] represents the price of a stock on day i.
    You are allowed to perform exactly one transaction:
        - Buy the stock on one day
        - Sell the stock on a later day (must be after the buying day)

    GOAL:
    Find the maximum profit that can be made from this single buy-sell transaction.
    If no profit is possible (i.e., the price only decreases), return 0.

    KEY IDEA:
    - Track the minimum price seen so far while scanning the array.
    - For each day, calculate the potential profit if you sold on that day:
            profit = prices[i] - minPrice
    - Keep updating the maximum profit found.

    EXAMPLE:
    prices = [7, 1, 5, 3, 6, 4]
    minimum so far updates like: 7 → 1
    profits calculated: 5-1 = 4, 3-1 = 2, 6-1 = 5, 4-1 = 3
    max profit = 5

    If prices are always decreasing (e.g., [7,6,4,3,1]), no profit can be made → return 0.
*/
