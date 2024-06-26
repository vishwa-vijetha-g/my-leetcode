class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int total = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            int complement = sum - k;
            if(hm.containsKey(complement)){
                total = total+hm.get(complement);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return total;
    }
}