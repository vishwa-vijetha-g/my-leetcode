class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        int sLen = s.length();
        for(int i=0; i<sLen; i++){
            Character c = s.charAt(i);

            if(c==']'){
                StringBuilder str = new StringBuilder();
                String number = new String();
                Integer num;
                StringBuilder texti = new StringBuilder();
                Character top = st.peek();
                while(top!='[' && st.size()>0){
                    texti.append(st.pop());
                    top = st.peek();
                }   
                st.pop();
                top = st.peek();
                while(Character.isDigit(top) && st.size()>0){
                    number = st.pop() + number;
                    if(st.size()>0){
                        top = st.peek();
                    }
                }

                num = Integer.valueOf(number);

                while(num>0){
                    for(int k = texti.length() - 1 ; k>=0;k--){
                        st.push(texti.charAt(k));
                    }
                    num--;
                }

            }else{
                st.push(c);
            }
        }

        //System.out.println(st);
        StringBuilder ans = new StringBuilder();
        for(Character c:st){
            ans.append(c);
        }
        return new String(ans);
    }
}