class Solution {
    public List<String> commonChars(String[] words) {

        List<String> ans = new ArrayList<>();

        if(words.length==1){
            for(char c:words[0].toCharArray()){
                ans.add(String.valueOf(c));
            }
            return ans;
        }

        ArrayList<HashMap<Character,Integer>> mapChars = new ArrayList<>();

        for(String s:words){
            mapChars.add(map(s));
        }

        // System.out.println(mapChars);

        for(Character c:mapChars.get(0).keySet()){
            int count = Integer.MAX_VALUE;;
            int currCount = Integer.MAX_VALUE;
            boolean containsAll = true;
            for(int i=1;i<mapChars.size();i++){
                if(mapChars.get(i).containsKey(c)){
                    currCount = Math.min(mapChars.get(0).get(c),mapChars.get(i).get(c));
                }else{
                    containsAll = false;
                    break;
                }

                count = Math.min(count,currCount);
            }

            while(containsAll && count>0){
                ans.add(String.valueOf(c));
                count--;
            }
        }

        return ans;
    }

    public HashMap<Character,Integer> map(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        int sLen = s.length();
        for(int i=0;i<sLen;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        return hm;
    }

}