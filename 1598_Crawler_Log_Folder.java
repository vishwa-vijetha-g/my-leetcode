class Solution {
    public int minOperations(String[] logs) {
        int forward = 0;
        for(String s:logs){
            if(s.equals("../")){
                if(forward!=0){
                    forward--;
                }
            }else if(s.equals("./")){
                continue;
            }else{
                forward++;
            }
        }
        return forward;
    }
}