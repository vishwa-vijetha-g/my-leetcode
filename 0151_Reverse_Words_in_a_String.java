class Solution {
    public String reverseWords(String s) {

        String[] splits = s.split("\\s+");

        // ArrayList<String> splitArr = new ArrayList<>(Arrays.asList(splits));

        // Collections.reverse(splitArr);

        StringBuilder ans = new StringBuilder();

        int n = splits.length-1;

        for(int i=n;i>=0;i--){
            ans.append(splits[i]);
            ans.append(" ");
        }


        return new String(ans).trim();
    }
}