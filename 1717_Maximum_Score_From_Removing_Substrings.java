class Solution {

    public int maximumGain(String s, int x, int y) {
        
        int score = 0;
        Stack<Character> st = new Stack<>();

        String pair1, pair2;
        int val1, val2;

        if(x>=y){
            pair1 = "ab";
            val1 = x;
            pair2 = "ba";
            val2 = y;
        }else{
            pair1 = "ba";
            val1 = y;
            pair2 = "ab";
            val2 = x;
        }

        for(char c:s.toCharArray()){
            if(c==pair1.charAt(1) && st.size()>0 && st.peek()==pair1.charAt(0)){
                st.pop();
                score+=val1;
            }else{
                st.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }

        s = sb.reverse().toString();

        for(char c:s.toCharArray()){
            if(c==pair2.charAt(1) && st.size()>0 && st.peek()==pair2.charAt(0)){
                st.pop();
                score+=val2;
            }else{
                st.push(c);
            }
        }

        return score;

    }
}