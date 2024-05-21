class Solution {
    public String removeStars(String s) {
        Stack<Character> strStack = new Stack<>();
        int strLen = s.length(); 
        for(int i=0; i<strLen; i++){
            if(s.charAt(i)!='*'){
                strStack.push(s.charAt(i));
            }else{
                strStack.pop();
            }
        }

        StringBuilder ans = new StringBuilder();

        for(Character c:strStack){
            ans.append(c);
        }

        return new String(ans);
    }
}