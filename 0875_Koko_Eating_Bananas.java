class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int p = piles.length;
        int begin = 1;
        int end = findMax(piles,p);
        int mid = 0;
        while(begin<=end){
            mid = begin + (end - begin)/2;
            long hours = hoursTaken(piles, mid);
            System.out.println(mid + " " + hours);
            if(hours<=h){
                end = mid - 1;
            }else{
                begin = mid+1;
            }

        }

        return begin;
    }

    public int findMax(int[] piles, int p){
        int maxi = piles[0];
        for(int i=1;i<p;i++){
            if(piles[i]>maxi){
                maxi = piles[i];
            }
        }
        return maxi;
    }

    public long hoursTaken(int[] piles, int n){
        long hs = 0;

        for(int i:piles){
            hs = hs + (int) Math.ceil((double) i/n);
            //System.out.println(n + " " + hs);
        }

        return hs;
    }


}