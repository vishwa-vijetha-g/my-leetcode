class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder wordMerge = new StringBuilder();

        int word1Len = word1.length();
        int word2Len = word2.length();

        int commonPart = (int) Math.min(word1Len, word2Len);

        for (int i = 0; i < commonPart; i++) {
            wordMerge.append(word1.charAt(i));
            wordMerge.append(word2.charAt(i));
        }

        if (word1Len < word2Len) {
            for (int i = word1Len; i < word2Len; i++) {
                wordMerge.append(word2.charAt(i));
            }
        }

        if (word2Len < word1Len) {
            for (int i = word2Len; i < word1Len; i++) {
                wordMerge.append(word1.charAt(i));
            }
        }

        return new String(wordMerge);
    }
}