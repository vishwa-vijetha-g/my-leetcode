class Solution {
    public int removeDuplicates(int[] nums) {
        int insertAt = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[insertAt]!=nums[i]){
                insertAt++;
                //swap(nums[insertAt], nums[i]);
                nums[insertAt] = nums[i];
            }
        }

        return insertAt+1;
    }
}