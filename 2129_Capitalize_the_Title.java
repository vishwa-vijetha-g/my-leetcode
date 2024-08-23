class Solution {
    public String capitalizeTitle(String title) {
        char[] titleArr = title.toLowerCase().toCharArray();
        int left = 0, right = 0;
        while (left < titleArr.length) {
            while (right < titleArr.length && titleArr[right] != ' ') {
                right++;
            }
            if (right - left > 2) {
                titleArr[left] = Character.toUpperCase(titleArr[left]);
            }
            left = right + 1;
            right = left;
        }
        return new String(titleArr);
    }
}