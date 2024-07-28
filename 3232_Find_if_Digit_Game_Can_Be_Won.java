class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum = 0;
        int doubleSum = 0;

        for(int n:nums){
            if(n>9){
                doubleSum+=n;
            }else{
                singleSum+=n;
            }
        }

        if(singleSum>doubleSum || doubleSum>singleSum){
            return true;
        }else{
            return false;
        }
    }
}