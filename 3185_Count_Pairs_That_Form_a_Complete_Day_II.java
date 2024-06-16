class Solution {
    public long countCompleteDayPairs(int[] hours) {
        int h = hours.length;        
        long ans = 0;

        HashMap<Integer,Long> hm = new HashMap<>();
        
        for(int i=0;i<h;i++){
            
            int current = hours[i]%24;
            int complement = 24 - current;
            if(hm.containsKey(complement)){
                ans += hm.get(complement);
            }
            if(current==0) current = 24;
            hm.put(current,hm.getOrDefault(current,0L)+1L);
        
        }

        return ans;
    }
    
}