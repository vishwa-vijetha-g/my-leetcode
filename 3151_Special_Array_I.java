class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        int prev = nums[0]%2==0 ? 0 : 1;
        for(int i=1;i<n;i++){
            if(prev == 0){
                if(nums[i]%2==0)
                    return false;
                prev = 1;
            }else{
                if(nums[i]%2==1)
                    return false;
                prev = 0;
            }
        }
        return true;
    }
}