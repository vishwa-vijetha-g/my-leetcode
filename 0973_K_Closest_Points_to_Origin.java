class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return ((b[0]*b[0])+(b[1]*b[1])) - ((a[0]*a[0])+(a[1]*a[1]));
        });

        for(int[] p:points){
            pq.add(p);
            if(pq.size()>k){
                pq.remove();
            }
        }

        return pq.toArray(new int[k][]);
    }
}