class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb;
        int len = s.length();
        int i=0;
        while(i<len){
            char c = s.charAt(i);
            if(c==')'){
                sb = new StringBuilder();
                while(st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
                for(char ch:sb.toString().toCharArray()){
                    st.push(ch);
                }
            }else{
                st.push(c);
            }
            i++;
        }
        sb = new StringBuilder();
        for(char cha:st){
            sb.append(cha);
        }
        return sb.toString();
    }
}