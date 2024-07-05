class Solution {
    public int removeDuplicates(int[] nums) {
        int insert = 1;
        int freq = 1;
        int prev = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]==prev){
                freq++;
            }else{
                prev = nums[i];
                freq = 1;
            }

            if(freq<=2){
                nums[insert] = prev;
                insert++;
            }
        }

        return insert;
    }
}