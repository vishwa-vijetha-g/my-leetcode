class Solution {
    public boolean canJump(int[] nums) {
        int present = 0;
        for(int i=0;i<nums.length;i++){
            if(i>present)
                return false;
            
            present = Math.max(present,i+nums[i]);
        }
        
        return true;
    }
}