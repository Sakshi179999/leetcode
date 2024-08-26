class Solution {
    private PriorityQueue<Integer> pq;
    private int k;
        
    public int findKthLargest(int[] arr, int k) {
        
       
            k=k;
            pq=new PriorityQueue<>(k) ; //inital capacity k
            for(int e:arr){
                pq.offer(e);
                if(pq.size() > k){
                    pq.poll();
                }
            }
        return pq.peek();
        
        
        }
    public int add(int val){
            pq.offer(val);
            if(pq.size() > k){
                pq.poll();
            }
            return pq.peek();
        
    }
}