class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int i=1;
        int index=-1;
        if(nums[0]==target || target<nums[0]) return 0;
        
        while(i<n){
            if(nums[i]==target){
                index=i;
                break;
            }
            else if(nums[i]>target && nums[i-1]<target){
                index=i;
                break;
            }
            i+=1;
        }
        if(index==-1) index=n;
        return index;
    }
}