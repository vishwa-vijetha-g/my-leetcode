class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int j = 0;
        for(char c:stones.toCharArray()){
            if(jewels.indexOf(c)!=-1){
                j++;
            }
        }
        return j;
    }
}