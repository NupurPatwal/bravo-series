package beta_arrays1.mar25;

public class buysellStocks {
    public static int buyandsellStocks(int[]prices){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit= 0;
//        loop:
        for (int i=0;i<prices.length;i++){
            if (buyPrice<prices[i]){ // profit
                int profit=prices[i]-buyPrice; //today
                maxProfit=Math.max(maxProfit,profit);
            }else {
                buyPrice =prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int[]prices={7,1,5,3,6,4};
        System.out.println(buyandsellStocks(prices));
    }
}
