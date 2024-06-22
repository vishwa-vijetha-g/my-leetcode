class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;
        boolean flipped = false;

        for(int i:nums){
            if((i==0 && !flipped)||(i==1 && flipped)){
                operations++;
                flipped = !flipped;
            }
        }

        return operations;
    }
}