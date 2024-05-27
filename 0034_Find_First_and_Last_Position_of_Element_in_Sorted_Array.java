class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = extremeLeftIndex(nums,target);
        ans[1] = extremeRightIndex(nums,target);

        return ans;
    }

    public int extremeLeftIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int leftInd = nums.length + 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                if(mid<leftInd){
                    leftInd = mid;
                }
                end = mid - 1;
            }else if(nums[mid]>target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        if( leftInd == nums.length + 1 ){
            return -1;
        }

        return leftInd;
    }

    public int extremeRightIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int rightInd = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                if(mid>rightInd){
                    rightInd = mid;
                }
                start = mid + 1;
            }else if(nums[mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        if(rightInd==-1){
            return -1;
        }

        return rightInd;
    }
}