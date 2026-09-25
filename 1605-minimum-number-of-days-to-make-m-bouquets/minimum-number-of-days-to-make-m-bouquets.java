class Solution {
    public static boolean isValid(int[] bloomDay,int day,int m,int k){
        int flowers=0;
        int bouquets=0;
        int n=bloomDay.length;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=day){
                flowers++;
            }
            else{
                flowers=0;
            }
            if(flowers==k){
                flowers=0;
                bouquets++;
            }
        }
        return bouquets>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int low=Integer.MAX_VALUE;
        int high=0;
        for(int i=0;i<n;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        long req_flowers=(long)m*k;
        if(req_flowers>n) return -1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(isValid(bloomDay,mid,m,k)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}