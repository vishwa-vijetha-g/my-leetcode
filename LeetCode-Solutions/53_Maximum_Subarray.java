class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int end = 0;
        int maxiSum = 0;
        int finalMaxiSum = Integer.MIN_VALUE;
        while(end<n){
            maxiSum = maxiSum + nums[end];

            finalMaxiSum = (int) Math.max(finalMaxiSum,maxiSum);

            if(maxiSum<0){
                maxiSum = 0;
            }

            end++;
        }

        return finalMaxiSum;
    }
}