class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();

        while(n >= 1 && !hs.contains(n)){
            if(n==1){
                return true;
            }else{
                hs.add(n);
                n = sumOfDigSquares(n);
            }
        }

        return false;
        
    }

    public int sumOfDigSquares(int s){
        int sumSq = 0;
        while(s>0){
            sumSq = sumSq + (int) Math.pow(s%10,2);
            s = s/10;
        }

        return sumSq;
    }
}