class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->{
            return a.getValue().equals(b.getValue()) ? b.getKey() - a.getKey() : a.getValue() - b.getValue();
        });

        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            pq.add(entry);
        }

        int[] ans = new int[nums.length];
        int index = 0;
        while(pq.size()>0){
            Map.Entry<Integer,Integer> entry = pq.remove();
            int val = entry.getValue();
            while(val>0){
                ans[index] = entry.getKey();
                index++;
                val--;
            }
        }

        return ans;
    }
}