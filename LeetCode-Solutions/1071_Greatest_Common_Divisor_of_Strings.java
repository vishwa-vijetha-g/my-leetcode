class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2 +str1)){
            return "";
        }
        
        int a = str1.length();
        int b = str2.length();

        int gcd = gcdStr(a, b);

        return str2.substring(0,gcd);
    }

    public int gcdStr(int a, int b){
        if(b==0){
            return a;
        }

        return gcdStr(b , a%b);
    }
}