class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int min = n + 1;

        int start = 0;
        int end = 0;
        int sum = 0;
        sum = sum + nums[end];

        while((start<n-1 || end<n-1) && (start<=end)){
            
            if(sum<target){
                if(end<n-1){
                    end++;
                    sum = sum + nums[end];
                }else if(start<n-1){
                    sum = sum - nums[start];
                    start++;
                }
            }

            if(sum>=target){
                min = Math.min(min,end-start+1);
                if(start<n-1){
                    sum = sum - nums[start];
                    start++;
                }else if(end<n-1){
                    end++;
                    sum = sum + nums[end];
                }
            }

        }

        if(sum>=target){
            min = Math.min(min,end-start+1);
        }

        return min == nums.length + 1 ? 0 : min;
    }
}