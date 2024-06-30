class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;

        int insert = nums.length - 1;

        while(start <= end){
            int left = nums[start] * nums[start];
            int right = nums[end] * nums[end];

            if(left>=right){
                ans[insert] = left;
                start++;
            }else{
                ans[insert] = right;
                end--;
            }

            insert--;
        }

        return ans;

    }
}