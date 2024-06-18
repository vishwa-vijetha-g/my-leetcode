class Solution {
    public String toLowerCase(String s) {
      StringBuilder sb = new StringBuilder();
      for(char c:s.toCharArray()){
        if(c>='A' && c<='Z'){
            sb.append((char)(c+32));
        }
        else{
            sb.append(c);
        }
      } 
      return sb.toString();
    }
}
