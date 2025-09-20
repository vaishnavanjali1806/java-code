public class program41 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int n = prices.length;
        int maxprofit = 0;
        int bestbuy = prices[0];
        for(int i = 0; i < n; i++){
            if(prices[i] > bestbuy){
                maxprofit = Math.max(maxprofit, prices[i]-bestbuy);

            }
            bestbuy = Math.min(bestbuy, prices[i]);
        }
        System.out.println(maxprofit);
    }
    
    
}
