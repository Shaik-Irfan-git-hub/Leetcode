class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int leftsum=0;
        int[] prefix=new int[n+1];
        prefix[0]=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            prefix[i+1]=sum;
        }
        for(int i=0;i<n;i++){
            int rightsum=sum-prefix[i]-nums[i];
            if(prefix[i]==rightsum){
                return i;
            }
        }
        return -1;
        
    }
}