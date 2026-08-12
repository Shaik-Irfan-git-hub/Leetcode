class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n];
        Arrays.fill(arr,-1);
        long sum=0;
        if((2*k+1)>n) return arr;
        for(int i=0;i<=2*k;i++){
            sum+=nums[i];
        }
        
        for(int i=k;i<n-k;i++){
            arr[i]=(int)(sum/(2*k+1));
            if(i<n-k-1){
                sum-=nums[i-k];
                sum+=nums[i+k+1];
            }
        }
        return arr;
    }
}