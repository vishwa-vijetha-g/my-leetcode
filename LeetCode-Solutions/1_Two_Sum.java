class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans[] = new int[2];
        int index = 0;
        for(int i:nums){

            if(hm.containsKey(target-i)){
                ans[0] = hm.get(target-i);
                ans[1] = index;
                return ans;
            }

            hm.put(i,index);
            index++;
        }

        return ans;
    }
}