class Solution {
    public int mySqrt(int x) {

        if(x==0){
            return 0;
        }

        int start = 1;
        int end = x;

        while(start<=end){

            int mid = start + (end-start)/2;

            if( mid <= x/mid && (mid + 1) > x/(mid +1) ){
                return mid;
            }else if(mid < x/mid){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }

        return start;
    }
}