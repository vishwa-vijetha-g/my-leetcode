class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];

        ArrayList<Integer> wordsArr = new ArrayList<>();

        String vowels = "aeiou";

        for(String w:words){
            if(vowels.indexOf(w.charAt(0))!=-1 && vowels.indexOf(w.charAt(w.length()-1))!=-1){
                wordsArr.add(1);
            }else{
                wordsArr.add(0);
            }
        }

        ArrayList<Integer> prefixSum = new ArrayList<>();

        int sum = 0;

        for(int i:wordsArr){
            sum+=i;
            prefixSum.add(sum);
        }

        int ansIndex = 0;

        for(int[] q:queries){
            int count = prefixSum.get(q[1]);
            if(q[0]!=0)
                count -=  prefixSum.get(q[0]-1);
            ans[ansIndex] = count;
            ansIndex++;
        }

        return ans;
    }
}