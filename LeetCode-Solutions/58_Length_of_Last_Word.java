class Solution {
    public int lengthOfLastWord(String s) {
        // String[] sSplit = s.split("\\s+");
        // int sLen = sSplit.length;
        // int end = sLen - 1;
        // return sSplit[end].length();

        int start = s.length() - 1;
        int ans = 0;

        for(int i=start;i>=0;i--){
            if(s.charAt(i)==' '){
                if(ans == 0){
                    continue;
                }else{
                    return ans;
                }
            }else{
                ans++;
            }
        }

        return ans;
    }
}