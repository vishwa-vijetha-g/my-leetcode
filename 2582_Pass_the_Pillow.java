class Solution {
    public int passThePillow(int n, int time) {

        int person = 1;
        boolean ltr = true;
        while(time>0){
            if(ltr){
                person++;
            }else{
                person--;
            }
            if(ltr && person==n){
                ltr = false;
            }
            if(!ltr && person==1){
                ltr = true;
            }
            time--;
        }
        return person;
    }
}