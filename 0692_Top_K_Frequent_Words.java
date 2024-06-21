class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer> hm = new HashMap<>();
        
        for(String word:words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }

        List<Map.Entry<String,Integer>> entrySet = new ArrayList<>(hm.entrySet());

        Collections.sort(entrySet,(a,b)->{
            
            if(a.getValue()>b.getValue()){
                return -1;
            }else if(a.getValue()<b.getValue()){
                return 1;
            }else{
                return a.getKey().compareTo(b.getKey());
            }
        
        });

        List<String> ans = new ArrayList<>();

        for(Map.Entry<String,Integer> me:entrySet){
            if(k==0) break;
            ans.add(me.getKey());
            k--;
        }

        return ans;
    }
}