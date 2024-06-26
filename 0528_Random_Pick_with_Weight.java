class Solution {

    int[] prefixSum;
    int len;
    Random rand;

    public Solution(int[] w) {
        for(int i=1;i<w.length;i++){
            w[i]+=w[i-1];
        }
        this.prefixSum = w;
        this.len = prefixSum.length;
        this.rand = new Random();
    }
    
    public int pickIndex() {
        int pick = this.rand.nextInt(this.prefixSum[this.len-1]) + 1;

        int start = 0;
        int end = this.len - 1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(prefixSum[mid]==pick)
                return mid;
            else if(prefixSum[mid]<pick)    
                start = mid + 1;
            else
                end = mid;
        }

        return start;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */