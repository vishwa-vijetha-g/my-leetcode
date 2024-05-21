class Solution {
    public int romanToInt(String s) {

        HashMap<Character,Integer> romans = new HashMap<>();

        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);

        String romansStr="IVXLCDM";

        int ans = 0;
        int sLen = s.length();

        if(sLen == 1){
            return romans.get(s.charAt(0));
        }

        char prevChar;
        char presentChar;
        ans = ans + romans.get(s.charAt(0));
        boolean skipNext = false;
        for(int i=1; i<sLen; i++){

            prevChar = s.charAt(i-1);
            presentChar = s.charAt(i);

            if(romansStr.indexOf(prevChar)<romansStr.indexOf(presentChar) &&(skipNext==false)){
                ans = ans - romans.get(prevChar) - romans.get(prevChar);
                skipNext = true;
            }else{
                skipNext = false;
            }

            ans = ans + romans.get(presentChar);
        }

        return ans;
    }
}