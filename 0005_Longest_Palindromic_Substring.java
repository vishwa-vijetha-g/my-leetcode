class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        String ans = new String();
        int sLen = s.length();
        if(sLen==1 || sLen==0){
            return s;
        }

        for(int i=1;i<sLen;i++){
            
            int j = i-1;
            int k = i+1;
            
            while(j>=0 && k<sLen && s.charAt(j)==s.charAt(k)){
                j--;
                k++;
            }
            if(k-j>max){
                max = k-j;
                ans = s.substring(j+1,k);
            }

            j = i - 1;
            k = i;

            while(j>=0 && k<sLen && s.charAt(j)==s.charAt(k)){
                j--;
                k++;
            }

            if(k-j>max){
                max = k-j;
                ans = s.substring(j+1,k);
            }
            

        }

        return ans;
    }
}