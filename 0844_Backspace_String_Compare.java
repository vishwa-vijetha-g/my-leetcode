class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> ss = new Stack<>();
        Stack<Character> ts = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#' && ss.size()>0)
                ss.pop();
            else if(s.charAt(i)!='#')
                ss.push(s.charAt(i));
        }

        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#' && ts.size()>0)
                ts.pop();
            else if(t.charAt(i)!='#')
                ts.push(t.charAt(i));
        }

        return ss.equals(ts);
    }
}