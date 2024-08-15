class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int n:nums){
            xor ^= n;
        }
        int lsb = 0;
        int check = 0;
        for(int i=0;i<32;i++){
            check = (xor >> i) & 1;
            if(check==1){
                lsb = i;
                break;
            }
        }
        int num1 = 0;
        int num2 = 0;
        for(int n:nums){
            check = (n >> lsb) & 1;
            if(check==1){
                num1 ^= n;
            }else{
                num2 ^= n;
            }
        }
        return new int[]{num1,num2};
    }
}