class MinStack {

    public Stack<Integer> st;
    public int stMin = Integer.MAX_VALUE;

    public MinStack() {
        st = new Stack<>();    
    }
    
    public void push(int val) {
        if(stMin>val){
            stMin = val;
        }
        st.push(val);
    }
    
    public void pop() {
        if(stMin==st.pop()){
            stMin = Integer.MAX_VALUE;
            for(int num:st){
                if(stMin>num){
                    stMin = num;
                }
            }
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return stMin;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */