class Solution {
    public boolean isArraySpecial(int[] nums) {
        
        int n = nums.length;

        int prev = nums[0]%2;

        for(int i=1;i<n;i++){
            if(nums[i]%2==prev)
                return false;
            prev = nums[i]%2;
        }
        
        return true;
    }
}