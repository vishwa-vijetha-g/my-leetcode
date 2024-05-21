class Solution {
    public int missingNumber(int[] nums) {
        int[] ans = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            ans[nums[i]] = 1;
        }

        for(int i=0;i<nums.length+1;i++){
            if(ans[i]==0){
                return i;
            }

        }

        return 0;
    }
}