class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        while(n>0){
            ans = ans + (n/5);
            n = n/5;
        }

        return ans;

        /*
        
        eg: n = 28;

        n! = 1! * 2! * 3! * 4! * 5! * ..... 10! * .... 15! * .... 20! * .... 25! * 26! * 27! * 28!;
        after first pass - we extract all the 1st powers of 5;
        now we divide n by 5 to extract all the 2nd powers of 5 (5^2s)
        go on till n becomes 0;
        
        */
    }
}