class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder ans = new StringBuilder();
        if((numerator <0 && denominator>0) || (numerator>0 && denominator<0))
            ans.append("-");

        long num = (long) Math.abs((long) numerator);
        long den = (long) Math.abs((long) denominator);

        long quotient = num / den;
        long remainder = num % den;

        ans.append(String.valueOf(quotient));

        if(remainder==0)
            return ans.toString();
        
        ans.append(".");

        HashMap<Long,Integer> map = new HashMap<>();

        while(remainder!=0){
            if(map.containsKey(remainder)){
                int pos = map.get(remainder);
                ans.insert(pos,"(");
                ans.append(")");
                return ans.toString();
            }else{
                map.put(remainder, ans.length());
                remainder = remainder * 10;
                quotient = remainder / den;
                remainder = remainder % den;
                ans.append(String.valueOf(quotient));
            }

        }

        return ans.toString();
    }
}