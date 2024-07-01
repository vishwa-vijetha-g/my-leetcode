class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0) return 0;

        int num = 0;
        int sign = '+';

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10 + (c-'0');
            }
            if(!Character.isDigit(c) && c!=' ' || i==s.length() - 1){
                if(sign=='+'){
                    st.push(num);
                }else if(sign=='-'){
                    st.push(-num);
                }else if(sign=='*'){
                    st.push(st.pop()*num);
                }else if(sign=='/'){
                    st.push(st.pop()/num);
                }
                sign = c;
                num = 0;
            }
        }

        int ans = 0;

        while(!st.isEmpty()){
            ans+= st.pop();
        }

        return ans;
    }
}