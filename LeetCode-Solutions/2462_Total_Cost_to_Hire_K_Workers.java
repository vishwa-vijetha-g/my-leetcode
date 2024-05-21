class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> leftQueue = new PriorityQueue<>();
        PriorityQueue<Integer> rightQueue = new PriorityQueue<>();

        long totalCost = 0;
        int c = costs.length;
        int start = 0;
        int end = c - 1;

        while(k>0){

            while(leftQueue.size()<candidates && start<=end){
                leftQueue.offer(costs[start]);
                start++;
            }

            while(rightQueue.size()<candidates && start<=end){
                rightQueue.offer(costs[end]);
                end--;
            }

            int topLeft = (leftQueue.size()>0) ? leftQueue.peek() : Integer.MAX_VALUE;
            int topRight = (rightQueue.size()>0) ? rightQueue.peek() : Integer.MAX_VALUE;

            if(topLeft<=topRight){
                totalCost = totalCost + topLeft;
                leftQueue.poll();
            }else{
                totalCost = totalCost + topRight;
                rightQueue.poll();
            }


            k--;
        }
        
        return totalCost;
    }
}