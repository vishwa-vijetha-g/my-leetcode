class Solution {
    public int climbStairs(int n) {
        int[] stairs = new int[46];
        stairs[1] = 1;
        stairs[2] = 2;
        return climb(stairs, n);
    }

    public int climb(int[] stairs, int n){
        if(n==1) return stairs[1];
        if(n==2) return stairs[2];

        if(stairs[n]==0)
            stairs[n] = climb(stairs, n-1) + climb(stairs, n-2);
        
        return stairs[n];
    }
}