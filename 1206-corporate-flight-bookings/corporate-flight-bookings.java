class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int m=bookings.length;
        int[] ans=new int[n];
        
        for(int i=0;i<m;i++){
            int left=bookings[i][0]-1;
            int right=bookings[i][1]-1;
            while(left<=right){
                ans[left]+=bookings[i][2];
                left++;
            }
        }
        return ans;
    }
}