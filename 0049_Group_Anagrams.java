class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        
        ArrayList<String> als;

        for(String s:strs){

            String acStr = alphaCount(s);
            
            if(hm.containsKey(acStr)){
                als = hm.get(acStr);
            }else{
                als = new ArrayList<>();
            }

            als.add(s);
            hm.put(acStr,als);
        }


        ans.addAll(hm.values());
        return ans;

    }

    public String alphaCount(String s){
        
        int[] acArr = new int[26];
        int sLen = s.length();

        for(int i=0;i<sLen;i++){
            acArr[s.charAt(i)-'a']++;
        }

        StringBuilder sb = new StringBuilder();
        char c = 'a';

        while(c<='z'){
            if(acArr[c-'a']!=0){
                sb.append(c);
                sb.append(acArr[c-'a']);
            }
            c++;
        }

        return new String(sb);
    }
}