class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x>=0 && x<=9){
            return true;
        }

        String s= String.valueOf(x);
        int sLen = s.length();
        int start = 0;
        int end = sLen - 1;

        while(start < end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}