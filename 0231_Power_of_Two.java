class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n<=0){
        //     return false;
        // }
        // while(n>0){
        //     if(n%2==1 && n!=1){
        //         return false;
        //     }
        //     n = n/2;
        // }
        // return true;
        //And operation between multiple of 2 and next lower number will always give 0 and other wise it will never be 0

        return n>0 && (n & (n-1))==0;
    }
}