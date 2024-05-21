class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> astStack = new Stack<>();

        for(int i:asteroids){
            if(astStack.isEmpty() || i>0){
                astStack.push(i);
            }else{
                while(true){
                    int top = astStack.peek();
                    if(top <0){
                        astStack.push(i);
                        break;
                    }else if(top == -i){
                        astStack.pop();
                        break;
                    }else if(top > -i){
                        break;
                    }else{
                        astStack.pop();
                        if(astStack.isEmpty()){
                            astStack.push(i);
                            break;
                        }
                        
                    }
                }
            }
        }

        int[] ans = new int[astStack.size()];

        for(int i=0;i<astStack.size();i++){
            ans[i] = astStack.get(i);
        }

        return ans;
    }
}