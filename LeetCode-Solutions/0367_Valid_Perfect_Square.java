class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        int mid;
        long sq;
        while(start<=end){
            mid = start + (end-start)/2;
            sq = (long) Math.pow(mid,2);
            if(sq == num){
                return true;
            }else if(sq<num){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }

        return false;
    }
}