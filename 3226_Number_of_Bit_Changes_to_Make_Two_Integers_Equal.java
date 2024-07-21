class Solution {
    public int minChanges(int n, int k) {
        
        if(n==k){
            return 0;
        }

        int[] nBin = new int[32];
        int[] kBin = new int[32];

        nBin = binary(n);
        kBin = binary(k);

        int ones = 0;

        for(int i=31;i>=0;i--){
            if(nBin[i]==1 && kBin[i]==0){
                nBin[i]=0;
                ones++;
            }

            if(Arrays.equals(nBin,kBin)){
                return ones;
            }
        }

        return -1;
        
    }

    public int[] binary(int a){
        int[] aBin = new int[32];
        int index = 31;

        while(a>0){
            aBin[index] = (a & 1);
            a = a >> 1;
            index --;
        }

        return aBin;
    }
}