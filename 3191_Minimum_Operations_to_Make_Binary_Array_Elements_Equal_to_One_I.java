class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;

        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                ans++;
                for(int j=i;j<i+3;j++){
                    nums[j] = nums[j] ^ 1;
                }
            }
        }

        for(int i:nums){
            if(i==0) return -1;
        }

        return ans;
    }
}