class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int a = 0;
        for(int i=0;i<n;i++){
            if(i==0){
                if(colors[n-1]!=colors[i] && colors[i]!=colors[i+1] && colors[n-1]==colors[i+1])
                    a++;
            }else if(i==n-1){
                if(colors[i-1]!=colors[i] && colors[i]!=colors[0] && colors[i-1]==colors[0])
                    a++;
            }else{
                if(colors[i-1]!=colors[i] && colors[i]!=colors[i+1] && colors[i-1]==colors[i+1])
                    a++;
            }
        }
        return a;
    }
}