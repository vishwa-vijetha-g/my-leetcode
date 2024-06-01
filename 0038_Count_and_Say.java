class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i=1;i<n;i++){
            s = cas(s);
        }
        return s;
    }

    public String cas(String s){
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(c==s.charAt(i)){
                count++;
            }else{
                sb.append(count);
                sb.append(c);
                count = 1;
                c = s.charAt(i);
            }
        }

        sb.append(count);
        sb.append(c);

        return new String(sb);
    }
}