class Solution {
    public int maxVowels(String s, int k) {
        int currVowels = 0;
        int maxVowels = 0;
        String vowels = "aeiou";
        int sLen = s.length();

        for(int i=0;i<k;i++){
            if((vowels.indexOf(s.charAt(i)))!=-1){
                currVowels++;
            }
        }

        maxVowels = currVowels;

        for(int i=k; i<sLen; i++){

            if((vowels.indexOf(s.charAt(i-k)))!=-1){
                currVowels--;
            }

            if((vowels.indexOf(s.charAt(i)))!=-1){
                currVowels++;
            }

            maxVowels = (int) Math.max(maxVowels, currVowels);
        }

        return maxVowels;
        
    }
}