class Solution {
    public boolean isPalindrome(String s) {
        int sLen = s.length();
        if(sLen==1){
            return true;
        }
        int start = 0;
        int end = sLen - 1;
        s = s.toLowerCase();
        char left;
        char right;
        boolean isLeftAlphanum = false;
        boolean isRightAlphanum = false;
        while(start<=end && start<sLen && end>=0){
            left = s.charAt(start);
            isLeftAlphanum = (left>='a' && left<='z') || (left>='0' && left <= '9');
            while(!isLeftAlphanum && start<sLen-1 && start<end-1){
                start++;
                left = s.charAt(start);
                isLeftAlphanum = (left>='a' && left<='z') || (left>='0' && left <= '9');
            }

            right = s.charAt(end);
            isRightAlphanum = (right>='a' && right<='z')|| (right>='0' && right <= '9');
            while(!isRightAlphanum && end>0 && end>start){
                end--;
                right = s.charAt(end);
                isRightAlphanum = (right>='a' && right<='z')|| (right>='0' && right <= '9');
            }

            if(left!=right && isLeftAlphanum && isRightAlphanum){
                return false;
            }

            start ++;
            end --;
        }

        return true;
    }
}