class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int f = flowerbed.length;

        for(int i=0; i<f; i++){

            if(flowerbed[i]==0){
                if(i==0 && f>1){
                    if(flowerbed[i+1]==0){
                        flowerbed[i] = 1;
                        n--;
                    }
                }else if(i>0 && i<f-1){
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0 ){
                        flowerbed[i] = 1;
                        n--;
                    }
                }else if(i==f-1 && f>1){
                    if(flowerbed[i-1]==0){
                        flowerbed[i] = 1;
                        n--;
                    }
                }else if(f==1){
                    flowerbed[i] = 1;
                    n--;
                }
            }

            if(n<=0){
                return true;
            }
        }

        return n<=0;
    }
}