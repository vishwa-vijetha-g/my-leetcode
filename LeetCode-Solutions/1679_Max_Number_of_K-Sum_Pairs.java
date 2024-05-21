class Solution {
    public int maxOperations(int[] nums, int k) {
        int operations = 0;
        int n = nums.length;
        
        Arrays.sort(nums);

        int left = 0;
        int right = n-1;

        while(left < right){
            if(nums[left]+nums[right] == k){
                operations++;
                left++;
                right--;
            }else if(nums[left]+nums[right] < k){
                left++;
            }else{
                right--;
            }
        }

        return operations;


    }
}