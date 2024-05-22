class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index==-1){
            return word;
        }
        char[] wordArr = word.toCharArray();
        for(int i=0;i<index;i++,index--){
            char temp = wordArr[i];
            wordArr[i] = wordArr[index];
            wordArr[index] = temp;
        }
        return new String(wordArr);
    }
}