class Solution {
    public boolean isSubsequence(String s, String t) {

        
        int sLen = s.length();
        int tLen = t.length();

        int sp = 0;
        int tp = 0;

        while(sp<sLen && tp<tLen){
            if(s.charAt(sp) == t.charAt(tp)){
                sp++;
                tp++;
            }else{
                tp++;
            }
        }
        
        return sp == sLen;

    }
}