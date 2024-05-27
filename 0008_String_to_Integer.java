class Solution {
    public int myAtoi(String s) {

        int sLen = s.length();
        int start = 0;
        int ans = 0;
        boolean pos = true;

        while(start<sLen && s.charAt(start)==' '){
            start++;
        }
        
        if(start<sLen && s.charAt(start)=='-'){
            pos = false;
            start++;
        }else if(start<sLen && s.charAt(start)=='+'){
            start++;
        }

        while(start<sLen && Character.isDigit(s.charAt(start))){
            
            int digit = s.charAt(start) -'0';

            if(ans>(Integer.MAX_VALUE-digit)/10){
                return pos ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            ans = (ans*10) + digit;
            start++;
        }

        return pos? ans:-ans;

    }
}