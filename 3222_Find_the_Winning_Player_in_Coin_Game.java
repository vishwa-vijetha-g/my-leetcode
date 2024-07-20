class Solution {
    public String losingPlayer(int x, int y) {
        // Game starts with Alice, Hence Alice's turn is true and Bob's turn is false
        boolean alicesTurn = true;
        boolean bobsTurn = false;
        // Game continues till there is one 75 unit coin to pick
        // and four 10 unit coin to pick
        while(x>=1 && y>=4){
            // Remove one coin from 75 unit coins
            x-=1;
            // Remove four coins from 10 unit coins
            y-=4;
            // If Alice completed his turn, change alicesTurn from true to false
            // If Bob completed his turn, change alicesTurn from false to true
            alicesTurn = !alicesTurn;
            // If Bob completed his turn, change bobsTurn from true to false
            // If Alice completed his turn, change bobsTurn from false to true
            bobsTurn = !bobsTurn;
        }
        // If next is Alice's turn, since we dont have enough coins, Bob is the winner
        // If next is Bob's turn, since we dont have enough coins, Alice is the winner
        return alicesTurn ? "Bob" : "Alice";
    }
}