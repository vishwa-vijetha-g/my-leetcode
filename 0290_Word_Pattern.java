class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split("\\s+");

        if(pattern.length()!=sArray.length){
            return false;
        }

        int len = pattern.length();

        LinkedHashMap<Character,Integer> hp = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> hs = new LinkedHashMap<>();


        for(int i=0;i<len;i++){
            hp.put(pattern.charAt(i), hp.getOrDefault(pattern.charAt(i),0) + 1);
            hs.put(sArray[i], hs.getOrDefault(sArray[i],0) + 1);

            if(!equalCheck(hp,hs)){
                return false;
            }

        }

        return true;



    }

    public boolean equalCheck(LinkedHashMap<Character,Integer> hp, LinkedHashMap<String,Integer> hs){
        ArrayList<Integer> ap = new ArrayList<>();
        ArrayList<Integer> as = new ArrayList<>();

        hp.forEach((key,value)->{
            ap.add(value);
        });

        hs.forEach((key,value)->{
            as.add(value);
        });

        return ap.equals(as);
    }
}