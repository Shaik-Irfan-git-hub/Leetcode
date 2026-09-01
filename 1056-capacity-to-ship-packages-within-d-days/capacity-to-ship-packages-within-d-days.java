class Solution {
    public static boolean canShip(int[] weights,int days,int k){
        int days_need=0;
        int sum=0;
        for(int weight:weights){
            if(sum+weight <=k){
                sum+=weight;
            }
            else{
                days_need++;
                sum=weight;
            }
        }
        if(sum!=0) days_need++;
        return days_need<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=0;
        int sum=0;
        for(int weight:weights){
            sum+=weight;
            low=Math.max(low,weight);
        }
        int high=sum;
        while(low<high){
            int mid=low+(high-low)/2;
            if(canShip(weights,days,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }

        }
        return low;
    }
}