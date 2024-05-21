/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        
        int start = 1;
        int end = (int) Math.pow(2,31) - 1;

        int guessnum = guess(n);

        while(guessnum!=0){
            if(guessnum == 1){  //number is lower than pick
                start = n + 1;
            }else if(guessnum == -1){ //number is higher than pick
                end = n - 1;
            }
            n = start + (end-start)/2 ;
            guessnum = guess(n);
        }
        return n;

        
    }

}