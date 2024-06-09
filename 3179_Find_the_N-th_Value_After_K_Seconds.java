class Solution {
    public int valueAfterKSeconds(int n, int k) {
        long prefixSum = 1;
        long overflow = (long) (Math.pow(10,9) + 7);
        ArrayList<Long> prefixSumArray = new ArrayList<>();
        for(int i=0;i<n;i++){
            prefixSumArray.add(prefixSum);
        }
        
        while(k>0){
            prefixSum = 1;
            for(int i=1;i<n;i++){
                prefixSum += prefixSumArray.get(i);
                prefixSum = prefixSum % overflow;
                prefixSumArray.set(i,prefixSum);
            }
            
            k--;
        }
        
        
        int ans = (int) (prefixSum % overflow);
        return ans;
        
    }
}