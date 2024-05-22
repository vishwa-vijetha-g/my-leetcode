class Solution {
    public int minFlips(int a, int b, int c) {
        String aBin = getBinary(a);
        String bBin = getBinary(b);
        String cBin = getBinary(c);

        System.out.println(aBin);
        System.out.println(bBin);
        System.out.println(cBin);

        int ans = 0;

        for(int i=0;i<32;i++){
            
            if(aBin.charAt(i)=='1' && bBin.charAt(i)=='1'){
                ans = cBin.charAt(i)=='1'? ans : ans+2;
            }else if(aBin.charAt(i)=='1' && bBin.charAt(i)=='0'){
                ans = cBin.charAt(i)=='1'? ans : ans+1;
            }else if(aBin.charAt(i)=='0' && bBin.charAt(i)=='1'){
                ans = cBin.charAt(i)=='1'? ans : ans+1;
            }else if(aBin.charAt(i)=='0' && bBin.charAt(i)=='0'){
                ans = cBin.charAt(i)=='1'? ans+1 : ans;
            }

            
        }

        return ans;
    }

    public String getBinary(int x){
        StringBuilder bin = new StringBuilder();
        int bits = 0;
        while(x>0){
            if(x%2==1){
                bin.append('1');
            }else{
                bin.append('0');
            }
            bits++;
            x = x/2;
        }

        while(bits<32){
            bin.append('0');
            bits++;
        }
        bin.reverse();
        return new String(bin);
    }
}