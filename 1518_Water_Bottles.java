class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = 0;
        int currDrank = 0;
        while(numBottles>0){
            numBottles--;
            totalDrank++;
            currDrank++;
            if(currDrank==numExchange){
                numBottles++;
                currDrank=0;
            }
        }
        return totalDrank;
    }
}