class Solution {
    public int findKthLargest(int[] nums, int k) {

        //using max heap

        // PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        // for(int i:nums){
        //     pq.add(i);
        // }

        // while(k>1){
        //     pq.remove();
        //     k--;
        // }

        // return pq.peek();


        //using min heap

        PriorityQueue<Integer> pq = new PriorityQueue();

        for(int i:nums){
            if(pq.size()<k){
                pq.add(i);
            }else{
                if(pq.peek()<i){
                    pq.remove();
                    pq.add(i);
                }
            }
        }

        return pq.peek();

    }
}