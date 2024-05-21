class Solution {
    public int compress(char[] chars) {
        int count = 1;
        char prevChar = chars[0];

        int n = chars.length;

        int insertAt = 0;
        

        for (int i = 1; i < n; i++) {
            if (chars[i] == prevChar) {
                count++;
            } else {
                insertAt = insertCharFreq(insertAt, chars, prevChar, count);
                prevChar = chars[i];
                count = 1;
            }
        }

        insertAt = insertCharFreq(insertAt, chars, prevChar, count);

        return insertAt;
    }

    private int insertCharFreq(int insertAt, char[] chars, char prevChar, int count) {
        char[] charsFreq;
        chars[insertAt] = prevChar;
        insertAt++;
        if (count > 1) {
            charsFreq = String.valueOf(count).toCharArray();
            for (int j = 0; j < charsFreq.length; j++) {
                chars[insertAt] = charsFreq[j];
                insertAt++;
            }
        }

        return insertAt;
    }
}