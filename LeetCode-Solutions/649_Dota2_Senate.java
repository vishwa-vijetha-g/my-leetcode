class Solution {
    public String predictPartyVictory(String senate) {

        ArrayDeque<Integer> rq = new ArrayDeque<>();
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int sLen = senate.length();

        for(int i=0;i<sLen;i++){
            if(senate.charAt(i)=='R'){
                rq.add(i);
            }else{
                dq.add(i);
            }
        }

        Integer rPos = 0;
        Integer dPos = 0;
        while(rq.size()>0 && dq.size()>0){
            rPos = rq.remove();
            dPos = dq.remove();

            if(rPos<dPos){
                rq.add(rPos + sLen);
            }else{
                dq.add(dPos + sLen);
            }
        }

        if(rq.size()==0){
            return "Dire";
        }

        return "Radiant";

    }
}