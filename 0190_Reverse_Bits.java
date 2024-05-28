public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;
        int bit = 0;

        for(int i=0;i<32;i++){
            bit = (n >> i) & 1;
            reverse = reverse | (bit << 31 - i);
        }

        return reverse;
    }
}