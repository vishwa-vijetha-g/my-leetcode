class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        for(int n:nums){
            int remainder = n%3;
            if(remainder==1 || remainder==2){
                operations++;
            }
        }
        return operations;
    }
}
