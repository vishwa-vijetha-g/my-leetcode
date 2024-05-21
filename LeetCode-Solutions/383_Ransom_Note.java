class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int m = magazine.length();
        int freqm;
        char cm;
        for(int i=0;i<m;i++){
            cm = magazine.charAt(i);
            freqm = hm.getOrDefault(cm, 0) + 1;
            hm.put(cm, freqm);
        }

        int r = ransomNote.length();
        int freqr;
        char cr;
        for(int i=0;i<r;i++){
            cr = ransomNote.charAt(i);
            if(!hm.containsKey(cr)){
                return false;
            }
            freqr = hm.get(cr) - 1;
            if(freqr==-1){
                return false;
            }

            hm.put(cr, freqr);
        }

        return true;
    }
}