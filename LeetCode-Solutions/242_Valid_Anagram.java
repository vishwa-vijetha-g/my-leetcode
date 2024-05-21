class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<>();
        
        int sLen = s.length();
        int tLen = t.length();

        if(sLen!=tLen){
            return false;
        }

        char cs;
        int freqs;

        for(int i=0; i<sLen; i++){
            cs = s.charAt(i);
            freqs = hs.getOrDefault(cs, 0) + 1;
            hs.put(cs, freqs);
        }

        char ct;
        int freqt;

        for(int i=0; i<tLen; i++){
            ct = t.charAt(i);
            if(!hs.containsKey(ct)){
                return false;
            }else{
                freqt = hs.get(ct);
                freqt--;
                if(freqt == 0){
                    hs.remove(ct);
                }else{
                    hs.put(ct, freqt);
                }
            }
        }

        return hs.isEmpty();
    }
}