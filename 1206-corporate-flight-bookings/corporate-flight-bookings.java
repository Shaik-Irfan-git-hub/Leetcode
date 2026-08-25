class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int m=bookings.length;
        int[] ans=new int[n+1];
        for(int i=0;i<m;i++){
            int a=bookings[i][0];
            int b=bookings[i][1];
            int c=bookings[i][2];
            ans[a-1]+=c;          //difference array
            ans[b]-=c;            //Range updates
        }
        for(int i=1;i<n;i++){
            ans[i]+=ans[i-1];
        }
        return Arrays.copyOfRange(ans,0,n);
        
    }
}