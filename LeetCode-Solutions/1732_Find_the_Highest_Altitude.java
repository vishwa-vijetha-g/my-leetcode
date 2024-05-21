class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int sum = 0;
        for(int i:gain){
            sum = sum + i;
            if(sum > maxAlt){
                maxAlt = sum;
            }
        }

        return maxAlt;
    }
}