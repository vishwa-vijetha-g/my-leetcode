class RecentCounter {

    int start;
    int end;
    ArrayDeque<Integer> pings;

    public RecentCounter() {
        this.start = 0;
        this.end = 0;
        this.pings = new ArrayDeque<>();

    }
    
    public int ping(int t) {
        start = t - 3000;
        end = t;
        pings.add(t);
        int top;
        top = pings.peek();
        while(top<start){
            pings.remove();
            top = pings.peek();
        }

        return pings.size();

        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */