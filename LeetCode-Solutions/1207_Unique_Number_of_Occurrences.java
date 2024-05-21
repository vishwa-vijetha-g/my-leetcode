class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int freq;
        for(int i:arr){
            freq = hm.getOrDefault(i,0);
            hm.put(i,freq+1);
        }

        HashSet<Integer> hs = new HashSet<>();

        for(Integer value:hm.values()){
            if(hs.contains(value)){
                return false;
            }
            hs.add(value);
        }

        return true;
    }
}