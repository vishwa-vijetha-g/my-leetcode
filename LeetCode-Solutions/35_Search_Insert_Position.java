class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int mid;

        if(target<=nums[start]){
            return 0;
        }
        if(target>nums[end]){
            return end+1;
        }
        
        while(start<=end){
            mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return start;
    }
}