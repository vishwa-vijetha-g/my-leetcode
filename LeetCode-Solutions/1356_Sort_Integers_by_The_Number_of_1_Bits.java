class Solution {
    public int[] sortByBits(int[] arr) {
        
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        
        
        for(int i:arr){
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(i);
            curr.add(noOfOnes(i));
            al.add(curr);
        }
        
        Collections.sort(al,(a,b)->{
            if(a.get(1)<b.get(1)){
                return -1;
            }else if(a.get(1)>b.get(1)){
                return 1;
            }else{
                return a.get(0) - b.get(0);
            }
        });
        

        //System.out.println(al);
        
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = al.get(i).get(0);
        }
        return ans;
    }
    
    public int noOfOnes(int i){
        int count = 0;
        
        while(i>0){
            count = count + (i & 1);
            i = i >> 1;
        }
        
        return count;
    }
    
}