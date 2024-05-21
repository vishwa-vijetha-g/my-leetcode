class Solution {
    public String reverseVowels(String s) {

        int sLen = s.length();

        if (sLen == 1) {
            return s;
        }

        char[] sArr = s.toCharArray();

        int left = 0;
        int right = sLen - 1;

        String vowels = "aeiouAEIOU";

        boolean isLeftVowel = false;
        boolean isRightVowel = false;

        while (left <= right && left < sLen && right > 0) {

            isLeftVowel = vowels.indexOf(sArr[left]) != -1;
            while (isLeftVowel != true && left < sLen-1) {
                left++;
                isLeftVowel = vowels.indexOf(sArr[left]) != -1;
            }

            isRightVowel = vowels.indexOf(sArr[right]) != -1;
            while (isRightVowel != true && right > 1) {
                right--;
                isRightVowel = vowels.indexOf(sArr[right]) != -1;

            }

            if (left <= right && isLeftVowel && isRightVowel) {
                char temp = sArr[left];
                sArr[left] = sArr[right];
                sArr[right] = temp;
            }

            left++;
            right--;

        }

        return new String(sArr);
    }
}