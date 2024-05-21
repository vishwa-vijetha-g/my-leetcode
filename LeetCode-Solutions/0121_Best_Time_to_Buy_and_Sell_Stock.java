class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i:prices){
            if(i<min){
                min = i;
            }else if(i-min>profit){
                profit = i - min;
            }
        }

        return profit;
    }
}