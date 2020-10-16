class BuyAndSellStock {
    public static int buysell1(int[] prices, int length) {
        if (length <= 1)
            return 0;
        int maxProfit = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - min);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] { 7, 6, 4, 3, 1 };
        System.out.println(buysell1(prices, prices.length));
    }
}
