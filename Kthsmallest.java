class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x:arr){
            pq.add(x);
        }
    
        for(int i=0;i<k-1;i++){
            pq.remove();
        }
        int val = pq.remove();
        return val;
    } 
}
