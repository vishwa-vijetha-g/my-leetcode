class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int ans = 0;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int[] p:pick){
                if(p[0]==i){
                    hm.put(p[1],hm.getOrDefault(p[1],0)+1);
                    int freq = hm.get(p[1]);
                    if(freq==(i+1)){
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}