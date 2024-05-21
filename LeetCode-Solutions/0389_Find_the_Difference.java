class Solution {
    public char findTheDifference(String s, String t) {
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        s = String.valueOf(charS);
        
        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        t = String.valueOf(charT);
        
        int p1 = 0;
        int p2 = 0;

        while(p1<s.length() && p2<t.length()){
            if(s.charAt(p1)!=t.charAt(p2)){
                return t.charAt(p2);
            }else{
                p1++;
                p2++;
            }
        }


        return t.charAt(p2);
    }
}