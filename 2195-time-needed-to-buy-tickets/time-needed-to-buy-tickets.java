class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        int cnt=0;
        int i=0;
        while(i<n){
            
            
            if(tickets[i]!=0){
                tickets[i]-=1;
                cnt++;
                if(tickets[k]==0){
                    
                    break;
                }
            }
            i++;
            if(i==n) i=0;

        }
        return cnt;
    }
}