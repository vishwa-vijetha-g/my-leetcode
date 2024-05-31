class Solution {
    public int titleToNumber(String columnTitle) {
        int cLen = columnTitle.length();
        int ans = 0;
        char c;
        for(int i=0;i<cLen;i++){
            c = columnTitle.charAt(i);
            ans += ((int) Math.pow(26,cLen-i-1)) * (c-'A'+1);
            //System.out.println(ans);
        }

        return ans;
    }
}