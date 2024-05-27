class Solution {

    public int[] original;
    public int[] numsArr;
    public Random random;

    public Solution(int[] nums) {
        this.numsArr = nums;
        this.original = nums.clone();
        random = new Random();
    }
    
    public int[] reset() {
        return original;
    }
    
    public int[] shuffle() {
        
        int n = numsArr.length;
        for(int i=n-1;i>=0;i--){
            int n2 = random.nextInt(i+1);
            int temp = numsArr[n2];
            numsArr[n2] = numsArr[i];
            numsArr[i] = temp;
        }

        return numsArr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */