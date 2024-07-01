class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odds = 0;
        for(int a:arr){
            if(a%2==1){
                odds++;
                if(odds==3)
                    return true;
            }else{
                odds = 0;
            }
        }
        return false;
    }
}