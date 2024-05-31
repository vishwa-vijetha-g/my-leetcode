class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mid;

        while(start<=end){

            mid = start + (end-start)/2;
            //System.out.println(start + " " + mid + " " + end);
            if(nums[mid]==target){
                return mid;
            }else{
                if(nums[start]<=nums[mid]){
                    if(nums[start]<=target && target<nums[mid]){
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }else{
                    if(nums[mid]<target && target<=nums[end]){
                        start = mid + 1;
                    }else{
                        end = mid - 1;
                    }
                }
            }
        }

        return -1;
    }
}