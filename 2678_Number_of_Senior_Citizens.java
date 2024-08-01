class Solution {
    public int countSeniors(String[] details) {
        int seniors = 0;
        for(String d:details){
            int age = Integer.valueOf(d.substring(11,13));
            if(age>60){
                seniors++;
            }
        }
        return seniors;
    }
}