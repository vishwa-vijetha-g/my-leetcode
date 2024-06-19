class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int plen = p.length();
        int slen = s.length();
        if(plen > slen) return ans;
        char[] pmap = new char[26];
        char[] smap = new char[26];

        for(int i=0;i<plen;i++){
            pmap[p.charAt(i)-'a']++;
            smap[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(pmap,smap)) ans.add(0);

        int l = 0;
        int r = plen;

        while(r<slen){
            smap[s.charAt(r)-'a']++;
            r++;
            smap[s.charAt(l)-'a']--;
            l++;

            if(Arrays.equals(pmap,smap)) ans.add(l);
        }

        return ans;
    }
}