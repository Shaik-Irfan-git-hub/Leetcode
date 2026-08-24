class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n+1];
        prefix[0]=0;
        int ls=0;
        int rs=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            prefix[i+1]=sum;
        }
        for(int i=0;i<n;i++){
            ls=prefix[i];
            rs=prefix[n]-prefix[i+1];
            if(ls==rs) return i;

        }
        return -1;
    }
}