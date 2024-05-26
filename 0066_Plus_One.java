class Solution {
    public int[] plusOne(int[] digits) {
        int digSize = digits.length;
        boolean carry = true;
        int currSum = 0;
        ArrayList<Integer> ansArr = new ArrayList<>();
        for(int i=digSize-1;i>=0;i--){
            if(carry){
                currSum = digits[i]+1;
                if(currSum<=9){
                    ansArr.add(currSum);
                    carry = false;
                }else{
                    ansArr.add(0);
                }
            }else{
                ansArr.add(digits[i]);
            }
        }

        if(carry){
            ansArr.add(1);
        }

        int ansLen = ansArr.size();
        int[] ans = new int[ansLen];
        for(int i = ansLen-1;i>=0;i--){
            ans[ansLen-1-i] = ansArr.get(i);
        }

        return ans;
        
    }
}