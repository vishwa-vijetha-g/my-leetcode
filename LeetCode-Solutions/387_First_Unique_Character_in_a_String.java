class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int freq;
        char c;
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            freq = hm.getOrDefault(c,0) + 1;
            hm.put(c, freq);
        }

        for(int i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }

        return -1;
    }
}