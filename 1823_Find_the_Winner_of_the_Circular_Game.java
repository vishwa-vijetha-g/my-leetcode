class Solution {
    public int findTheWinner(int n, int k) {
        
        ArrayList<Integer> friends = new ArrayList<>();
        for(int i=1;i<=n;i++){
            friends.add(i);
        }

        int remove = 0;

        while(n > 1){
            remove = (remove + (k-1))%n;
            friends.remove(remove);
            n--;
        }

        return friends.get(0);
    }
}