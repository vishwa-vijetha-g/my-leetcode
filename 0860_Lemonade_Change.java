class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveBills = 0;
        int tenBills = 0;
        int twentyBills = 0;
        for(int b:bills){
            if(b==5){
                fiveBills++;
            }else if(b==10){
                tenBills++;
                if(fiveBills>0){
                    fiveBills--;
                }else{
                    return false;
                }

            }else if(b==20){
                twentyBills++;
                if(tenBills>0 && fiveBills>0){
                    tenBills--;
                    fiveBills--;
                }else if(fiveBills>2){
                    fiveBills -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}