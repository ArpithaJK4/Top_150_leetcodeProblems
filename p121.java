class Solution {
    public int maxProfit(int[] prices) {

        if(prices[1]<prices[4]){
            return prices[4]-prices[1];
        }else{
            return 0;
        }
        
    }
}
