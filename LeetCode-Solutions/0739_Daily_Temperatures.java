class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> temps = new Stack<>();
        int t = temperatures.length;
        int[] ans = new int[t];

        for(int i=t-1;i>=0;i--){

            while(temps.size()>0 && temperatures[temps.peek()]<=temperatures[i]){
                temps.pop();
            }

            if(temps.size()>0){
                ans[i] = temps.peek() - i;
            }

            temps.push(i);
        }

        return ans;
    }
}