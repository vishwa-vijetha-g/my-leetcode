class Solution {
    public int removeElement(int[] nums, int val) {
        int insert = 0;
        for(int i:nums){
            if(i==val){
                continue;
            }
            nums[insert] = i;
            insert++;
        }

        return insert;
    }
}