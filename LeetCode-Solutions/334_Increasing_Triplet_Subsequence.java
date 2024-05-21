class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;

        for(int s3:nums){
            if(s3<=s1){
                s1 = s3;
            }else if(s3<=s2){
                s2 = s3;
            }else{
                return true;
            }
        }

        return false;
        
    }
}