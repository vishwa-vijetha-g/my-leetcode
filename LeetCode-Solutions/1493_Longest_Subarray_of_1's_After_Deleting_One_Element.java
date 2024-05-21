class Solution {
    public int longestSubarray(int[] nums) {

        int n = nums.length;

        int start = 0;
        int end = 0;
        int maxiLen = 0;
        int currLen = 0;

        int deletions = 0;

        while(end<n){
            if(nums[end]==1){
                end++;
            }else{
                deletions++;
                end++;
            }

            while(deletions>1){
                if(nums[start]==0){
                    deletions--;
                }
                start++;
            }

            currLen = end - start - 1;

            maxiLen = (int) Math.max(maxiLen, currLen);
        }
        
        return maxiLen;
    }
}