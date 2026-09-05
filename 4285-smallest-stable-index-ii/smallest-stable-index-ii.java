class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int[] mini= new int[nums.length];
       int[] maxi= new int[nums.length];
       int minEle=Integer.MAX_VALUE;
       int maxEle=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>maxEle)
        {
            maxEle=nums[i];
        }
        maxi[i]=maxEle;
       }
       for(int i=nums.length-1;i>=0;i--)
       {
        if(nums[i]<minEle)
        {
            minEle=nums[i];
        }
        mini[i]=minEle;
       }
       for(int i=0;i<nums.length;i++)
       {
        if((maxi[i]-mini[i])<=k)
        {
            return i;
        }
       }
       return -1;

    }
}