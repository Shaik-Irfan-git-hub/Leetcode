class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        
        int sum=0;
        int len=0;
        int i=0;
        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            sum+=nums[j];
            while(sum>=target){
                len=j-i+1;
                min=Math.min(min,len);
                sum-=nums[i];
                i++;
            }

        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}