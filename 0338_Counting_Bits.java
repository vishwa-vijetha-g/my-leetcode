class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for(int i=0;i<n+1;i++){
            ans[i] = noOfOnes(i);
        }

        return ans;
    }

    public int noOfOnes(int b){
        int ones = 0;

        while(b>0){
            if(b%2==1){
                ones++;
            }
            b=b/2;
        }

        return ones;
    }
}