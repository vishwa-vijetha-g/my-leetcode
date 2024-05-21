class Solution {
    public boolean closeStrings(String word1, String word2) {

        int word1Len = word1.length();
        int word2Len = word2.length();

        if(word1Len!=word2Len){
            return false;
        }

        HashMap<Character,Integer> word1CharFreq = new HashMap<>();
        int freq1 = 0;

        for(int i=0; i<word1Len; i++){
            freq1 = word1CharFreq.getOrDefault(word1.charAt(i),0) + 1;
            word1CharFreq.put(word1.charAt(i), freq1);
        }

        HashMap<Character,Integer> word2CharFreq = new HashMap<>();
        int freq2 = 0;

        for(int i=0; i<word2Len; i++){
            freq2 = word2CharFreq.getOrDefault(word2.charAt(i),0) + 1;
            word2CharFreq.put(word2.charAt(i), freq2);
        }

        Set<Character> word1Chars = word1CharFreq.keySet();
        Set<Character> word2Chars = word2CharFreq.keySet();

        for(Character c:word2Chars){
            if(!word1Chars.contains(c)){
                return false;
            }
        }

        ArrayList<Integer> word1Freqs = new ArrayList<>(word1CharFreq.values());
        ArrayList<Integer> word2Freqs = new ArrayList<>(word2CharFreq.values());

        int word1FreqsLen = word1Freqs.size();
        int word2FreqsLen = word2Freqs.size();

        if(word1FreqsLen!=word2FreqsLen){
            return false;
        }

        Collections.sort(word1Freqs);
        Collections.sort(word2Freqs);

        for(Integer i=0;i<word1FreqsLen;i++){
            
            if(!word1Freqs.get(i).equals(word2Freqs.get(i))){
                return false;
            }
        }

        

        return true;

    }
}