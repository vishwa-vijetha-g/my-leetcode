class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int strsLen = strs.length;

        if(strs.length==1){
            return strs[0];
        }

        int minStrLen = Integer.MAX_VALUE;

        for(String s:strs){
            minStrLen = (int) Math.min(minStrLen, s.length());
        }

        StringBuilder ans = new StringBuilder();

        int checker = 0;
        char prevCheck;
        boolean presentAll = true;
        
        while(checker<minStrLen && presentAll){
            
            prevCheck = strs[0].charAt(checker);
            for(int i = 1;i<strsLen;i++){
                if(prevCheck != strs[i].charAt(checker)){
                    presentAll = false;
                    break;
                }
            }
            if(presentAll==false){
                break;
            }
            ans.append(prevCheck);
            checker++;
        }

        return new String(ans);

    }
}