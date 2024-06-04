class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int middle = 0;
        int end = nums.length - 1;

        while(middle<=end){
            if(nums[middle]==0){
                swap(nums,start,middle);
                start++;
                middle++;
            }else if(nums[middle]==2){
                swap(nums,middle,end);
                end--;
            }else{
                middle++;
            }
        }
        
    }

    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}