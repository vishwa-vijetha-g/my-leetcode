class Solution {
    public boolean isValid(String s) {
        String openings = "([{";
        String closings = ")]}";

        Stack<Character> par = new Stack<>();
        int sLen = s.length();
        char bracket;
        char top;
        for(int i=0;i<sLen;i++){
            bracket = s.charAt(i);
            if(openings.indexOf(bracket)!=-1){
                par.push(bracket);
            }else if(par.isEmpty()){
                return false;
            }else{
                top = par.pop();
                if(openings.indexOf(top)!=closings.indexOf(bracket)){
                    return false;
                }
            }
        }


        return par.isEmpty();
    }
}