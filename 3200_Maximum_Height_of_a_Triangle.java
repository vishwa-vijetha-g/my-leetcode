class Solution {
    
    public int maxHeightOfTriangle(int red, int blue) {
        int max = 0;
        int blue1 = blue;
        int red1 = red;
        
        boolean blueFirst = true;
        int levels1 = 0;
        int balls1 = 1;
        
        while(blue1>=0 && red1>=0){
            if(blueFirst){
                blue1 = blue1 - balls1;
                blueFirst = false;
                balls1++;
                if(blue1>=0){
                    levels1++;
                }
            }else{
                red1 = red1 - balls1;
                blueFirst = true;
                balls1++;
                if(red1>=0){
                    levels1++;
                }
            }

        }
        
        int blue2 = blue;
        int red2 = red;
        
        boolean redFirst = true;
        int levels2 = 0;
        int balls2 = 1;
        
        while(blue2>=0 && red2>=0){
            if(redFirst){
                red2 = red2 - balls2;
                redFirst = false;
                balls2++;
                if(red2>=0){
                    levels2++;
                }
            }else{
                blue2 = blue2 - balls2;
                redFirst = true;
                balls2++;
                if(blue2>=0){
                    levels2++;
                }
            }

        }
        
        max = Math.max(levels1,levels2);

        return max;
    }
    
}