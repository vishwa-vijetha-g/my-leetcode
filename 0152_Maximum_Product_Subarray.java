class Solution {
    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int ans = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(currMax*nums[i],nums[i]);
            currMin = Math.min(currMin*nums[i],nums[i]);
            
            ans = Math.max(ans,currMax);
        }

        return ans;
    }
}