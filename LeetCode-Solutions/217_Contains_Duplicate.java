class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet<Integer> hs = new HashSet<>();
        // for(int i:nums){
        //     if(hs.contains(i)){
        //         return true;
        //     }
        //     hs.add(i);
        // }
        // return false;

        Arrays.sort(nums);

        int prev = nums[0];

        for(int i=1;i<nums.length;i++){
            int curr = nums[i];

            if(curr==prev){
                return true;
            }

            prev = curr;
        }

        return false;
    }
}