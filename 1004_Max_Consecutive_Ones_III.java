class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int zeroes = 0;
        int left = 0;
        int right = 0;
        int currMax = 0;
        int finalMax = 0;

        while(right < n){

            if(nums[right] == 1){
                right++;
            }else{
                zeroes++;
                right++;
            }

            while(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }

            currMax = right - left;
            finalMax = (int) Math.max(finalMax, currMax);

        }

        return finalMax;
    }
}