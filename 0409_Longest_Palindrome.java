class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        int sLen = s.length();
        
        for(int i=0;i<sLen;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }

        int odds = 0;
        int oddSum = 0;

        int evens = 0;
        int evenSum = 0;

        for(int i:hm.values()){
            if(i%2==0){
                evens++;
                evenSum+=i;
            }else{
                odds++;
                oddSum+=i;
            }
        }

        if(odds == 0){
            return evenSum;
        }else{
            return evenSum + (oddSum - odds + 1);
        }


    }
}