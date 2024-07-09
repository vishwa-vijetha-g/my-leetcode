class Solution {
    public int minimumChairs(String s) {
        int max = 0;
        int chairs = 0;
        for(char c:s.toCharArray()){
            if(c=='E'){
                chairs++;
            }else{
                chairs--;
            }
            max = Math.max(max,chairs);
        }
        return max;
    }
}