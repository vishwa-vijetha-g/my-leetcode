class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        int sLen = s.length();
        char c;
        for(int i=0;i<sLen;i++){
            c = s.charAt(i);
            if(Character.isDigit(c)){
                st.pop();
            }else{
                st.push(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        
        return sb.toString();
    }
}