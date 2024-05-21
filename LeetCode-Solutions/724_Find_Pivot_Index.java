class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        int ps = 0;
        int ss = 0;

        for(int i=0;i<n;i++){
            ps = ps + nums[i];
            prefixSum[i] = ps;

            ss = ss + nums[n-1-i];
            suffixSum[n-1-i] = ss;
        }

        
        for(int i=0;i<n;i++){
            if(prefixSum[i]==suffixSum[i]){
                return i;
            }
        }

        return -1;
    }
}