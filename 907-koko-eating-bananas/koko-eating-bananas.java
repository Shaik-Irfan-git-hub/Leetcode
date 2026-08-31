class Solution {
    public static boolean canEat(int[] piles,int h,int k){
        long hoursneed=0;
        for(int pile:piles){
            hoursneed+=(pile+k-1)/k;
        }
        return hoursneed<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        while(low<high){
            int mid=(low+high)/2;
            if(canEat(piles,h,mid)){
                high=mid;
            }
            else low=mid+1;
        }
        return low;
        
    }
}