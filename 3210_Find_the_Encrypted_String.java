class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            sb.append(s.charAt((i + k) % len));
        }
        return sb.toString();
    }
}