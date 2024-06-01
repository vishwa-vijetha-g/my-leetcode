class Solution {
    public int getSum(int a, int b) {
        /*

        if(b==0){
            return a;
        }

        return getSum(a^b, (a&b) << 1);

        */

        int c;

        while(b!=0){
            c = ( a & b ) << 1;
            a = a  ^ b;
            b = c;
        }

        return a;
    }
}