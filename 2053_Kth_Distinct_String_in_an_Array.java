class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        for(String s:arr){
            lhm.put(s,lhm.getOrDefault(s,0)+1);
        }
        int distinct = 0;
        for(Map.Entry<String,Integer> entry:lhm.entrySet()){
            if(entry.getValue()==1) distinct++;
            if(distinct==k) return entry.getKey();
        }
        return "";
    }
}