class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        for(char c:s.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
            if(hs.get(c)==3){
                hs.put(c,1);
            }
        }
        int ans = 0;
        for(int v:hs.values()){
            ans+=v;
        }
        return ans;
    }
}