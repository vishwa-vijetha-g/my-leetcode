class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        Integer sLen = s.length();
        int maxi = 0;
        int start = 0;
        int end = 0;
        Character ch;
        while(end<sLen){
            ch = s.charAt(end);
            if(hm.containsKey(ch)){
                int deleteUpto = hm.get(ch);
                while(start<=deleteUpto){
                    start++;
                }
            }
            hm.put(ch,end);
            maxi = (int) Math.max(maxi, end - start + 1);
            end++;
        }

        return maxi;
    }
}