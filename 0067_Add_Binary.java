class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int carry = 0;
        int sum = 0;

        StringBuilder ans = new StringBuilder();

        while(aLen>=0 || bLen>=0 || carry==1){
            sum = 0;
            if(aLen>=0){
                sum = sum + a.charAt(aLen)-'0';
                aLen--;
            }
            if(bLen>=0){
                sum = sum + b.charAt(bLen)-'0';
                bLen--;
            }
            sum = sum + carry;

            ans.append(sum%2);
            carry = sum / 2;
        }

        return ans.reverse().toString();
    }
}