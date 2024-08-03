class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int t:target){
            hm.put(t,hm.getOrDefault(t,0)+1);
        }
        for(int a:arr){
            if(!hm.containsKey(a)){
                return false;
            }
            hm.put(a,hm.get(a)-1);
            if(hm.get(a)==0){
                hm.remove(a);
            }
        }
        return true;
    }
}