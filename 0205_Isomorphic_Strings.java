class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sChar = new int[128];
        int[] tChar = new int[128];

        int len = s.length();

        for(int i=0;i<len;i++){
            if(sChar[s.charAt(i)]!=tChar[t.charAt(i)]){
                return false;
            }
            sChar[s.charAt(i)]=i+1;
            tChar[t.charAt(i)]=i+1;
        }

        return true;
    }
}