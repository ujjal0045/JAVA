package Array;

public class buySell {
  public static void checkProfit(int prices[]){
    int buying = prices[0],buyingIdx=0;
    int profit =0;
    for(int i=1;i<prices.length;i++){
      if(prices[i] > 0 ){
        if(prices[i]<buying){
        buying = prices[i];
        buyingIdx = i;
      }
      }
    }

    for(int i = buyingIdx+1; i<prices.length;i++){
      int max = 0;
      if(buying < prices[i]){
        max += prices[i] -  buying; 
      }
      profit = Math.max(max, profit);
    }
    if(profit < 0){
      System.out.println("No profit");
    } else{
      System.out.println("Maximum profit: " + profit);
    }
  }
  // optimized solution
  public static void butAndSellStocks(int price[]){
    int buyPrice = Integer.MAX_VALUE;
    int maxprofit = 0;
    for(int i=0;i<price.length;i++){
      if(buyPrice < price[i]){
        int profit = price[i] - buyPrice;
        maxprofit = Math.max(maxprofit, profit);
      } else{
        buyPrice = price[i];
      }
    }
    System.out.println("TOtal profit = "+maxprofit);
  }
  public static void main(String[] args) {
    int prices[] = {7,1,5,3,6,4};
    checkProfit(prices);
  }
}
