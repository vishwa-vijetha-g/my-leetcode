class Solution {
    public int appendCharacters(String s, String t) {
        int sp = 0;
        int tp = 0;

        while(sp<s.length() && tp<t.length()){
            if(s.charAt(sp)==t.charAt(tp)){
                sp++;
                tp++;
            }else{
                sp++;
            }
        }

        return t.length() - tp;
    }
}