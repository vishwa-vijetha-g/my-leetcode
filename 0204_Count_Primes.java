class Solution {
    public int countPrimes(int n) {

        boolean[] ans = new boolean[n];

        

        if(n<2){
            return 0;
        }

        int count = -2; // because of 0 and 1 in the ans array

        for(int i=2;i*i<n;i++){
            if(ans[i]==true){
                continue;
            }
            for(int j=i*i;j<n;j=j+i){
                ans[j] = true;
            }
        }

        for(boolean a:ans){
            if(!a){
                count++;
            }
        }

        return count;
    }
}