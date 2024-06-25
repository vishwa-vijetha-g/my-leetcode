class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int longest = 0;
        int max = 0;
        int[] freq = new int[26];

        while(right < s.length()){
            char c = s.charAt(right);
            freq[c-'A']++;
            max = Math.max(max,freq[c-'A']);
            

            while(right - left + 1 - max > k){
                freq[s.charAt(left)-'A']--;
                left++;
                
                max = 0;
                for(int i=0;i<26;i++)
                    max = Math.max(max,freq[i]);
            }

            longest = Math.max(longest, right - left + 1);
            
            right++;
            
        }

        return longest;
    }
}