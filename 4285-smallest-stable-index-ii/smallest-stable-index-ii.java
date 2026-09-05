class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int[] mini= new int[nums.length];
       int minEle=Integer.MAX_VALUE;
       int maxEle=0;
       
       for(int i=nums.length-1;i>=0;i--)
       {
        if(nums[i]<minEle)
        {
            minEle=nums[i];
        }
        mini[i]=minEle;
       }
       for(int i=0;i<nums.length;i++){
       maxEle=Math.max(maxEle,nums[i]);
       
        if((maxEle-mini[i])<=k)
        {
            return i;
        }
       }
       return -1;

    }
}