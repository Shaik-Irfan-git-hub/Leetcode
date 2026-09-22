class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        ArrayDeque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            q.offer(i);
        }
        int sum=0;
        while(tickets[k]!=0){
            int idx=q.peek();
            q.poll();
            if(tickets[idx]!=0){
                sum+=1;
                tickets[idx]-=1;
                if(tickets[idx]!=0) q.offer(idx);
            }
        }
        return sum;
    }
}