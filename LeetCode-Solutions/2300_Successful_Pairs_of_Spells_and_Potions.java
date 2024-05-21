class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        
        int spellsLen= spells.length;
        int potionsLen = potions.length;
        int[] ans = new int[spellsLen];

        for(int i=0;i<spellsLen;i++){
            ans[i] = successes(spells[i], potions, potionsLen, success);
        }

        return ans;


    }

    public int successes(int s, int[] potions, int potionsLen, long success){
        int pairs = -1;
        int start = 0;
        int end = potionsLen - 1;
        int mid = 0;
        while(start<=end){
            mid = start + (end - start)/2 ;
            long prod = (long) s * potions[mid];
            if(prod>=success){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        pairs = potionsLen - start;

        return pairs;
    }
}