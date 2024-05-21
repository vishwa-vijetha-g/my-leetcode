class Solution {
    public int majorityElement(int[] nums) {
        int majorNum = nums[0];
        int majorNumCount = 1;

        for(int i = 1; i< nums.length; i++){
            if(nums[i]==majorNum){
                majorNumCount++;
            }else{
                majorNumCount--;
                if(majorNumCount<0){
                    majorNum = nums[i];
                    majorNumCount = 1;
                }
            }
        }

        return majorNum;
    }
}