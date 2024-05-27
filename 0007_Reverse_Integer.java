class Solution {
    public int reverse(int x) {

        int ans = 0;
        int d;
        int digits = 0;

        int y = x;

        while(y!=0){
            digits++;
            y= y/10;
        }

        d = digits;
        y = x;

        while(y!=0){
            int dig = y%10;
            ans = ans + (dig * ((int) Math.pow(10,digits-1)));
            digits--;
            y = y/10;

        }

        if(x==revAns(ans, d)){
            return ans;
        }

        return 0;
    }

    public int revAns(int ans, int d){
        int y = ans;
        int answ = 0;
        while(y!=0){
            int dig = y%10;
            answ = answ + (dig * ((int) Math.pow(10,d-1)));
            d--;
            y = y/10;
        }

        return answ;
    }



}