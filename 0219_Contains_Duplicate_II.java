class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> q = new HashSet<>();
        int start=0;
        for(int i:nums){
            if(q.contains(i)){
                return true;
            }

            if(q.size()<=k){
                q.add(i);
            }

            if(q.size()>k){
                q.remove(nums[start]);
                start++;
            }

        }

        return false;
    }
}