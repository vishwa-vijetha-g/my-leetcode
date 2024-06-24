class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int max = 1;
        int curr = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else if(Math.abs(nums[i]-nums[i+1])==1){
                curr++;
                max = Math.max(max,curr);
            }
            else{
                curr = 1;
            }
        }
        return max;
    }
}