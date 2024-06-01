class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        //System.out.println(hm);

        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();
        for(int i=0;i<=nums.length+1;i++){
            bucket.add(new ArrayList<Integer>());
        }
        ArrayList<Integer> temp;

        for(int i:hm.keySet()){
            temp = bucket.get(hm.get(i));
            temp.add(i);
            bucket.set(hm.get(i),temp);
        }

        //System.out.println(bucket);

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=bucket.size()-1;i>=0 && k>0;i--){
            temp = bucket.get(i);
            if(temp.size()>0){
                for(int j=0;j<temp.size();j++){
                    ans.add(temp.get(j));
                    k--;
                    if(k<=0){
                        break;
                    }
                }
            }
        }

        //System.out.println(ans);

        int[] finalAns = new int[ans.size()];
        int f = 0;
        for(int i:ans){
            finalAns[f] = i;
            f++;
        }

        return finalAns;
    
    }
}