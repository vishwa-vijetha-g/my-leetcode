class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int n = nums.length;
        int end = 0;

        while(end <n){
            if(nums[end]!=0){
                nums[start] = nums[end];
                start++;
            }
            end++;
        }

        while(start<n){
            nums[start] = 0;
            start++;
        }

    }
}