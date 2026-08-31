class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int lb=0;
        int ub=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        lb=low;
        low=0;
        high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        ub=low;
        return (lb==ub) ? new int[]{-1,-1} : new int[]{lb,ub-1};
    }
}