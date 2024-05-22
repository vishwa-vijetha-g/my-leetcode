class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while(xor>0){
            count = count + (((xor & 1) == 1) ? 1 : 0);
            xor = xor >> 1;
        }
        return count;
    }
}