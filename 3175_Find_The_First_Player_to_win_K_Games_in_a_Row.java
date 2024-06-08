class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        
        int sLen = skills.length;
        k = k<=sLen ? k : sLen + 1;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int freq = 0;
        for(int s:skills){
            q.addLast(s);
        }
        
        while(freq!=k){
            int p1 = q.removeFirst();
            int p2 = q.removeFirst();
            
            if(p1>p2){
                freq = hm.getOrDefault(p1,0) + 1;
                if(freq==k){
                    return indexOf(skills,p1);
                    
                }
                hm.put(p1,freq);
                q.addFirst(p1);
                q.addLast(p2);
                
            }else{
                freq = hm.getOrDefault(p2,0) + 1;
                if(freq==k){
                    return indexOf(skills,p2);
                    
                }
                hm.put(p2,freq);
                q.addFirst(p2);
                q.addLast(p1);
            }
        }
        return -1;
        
    }
    
    public int indexOf(int[] skills, int target){
        int index = 0;
        for(int s:skills){
            if(s==target){
                return index;
            }
            index++;
        }
        
        return index;
    }
}