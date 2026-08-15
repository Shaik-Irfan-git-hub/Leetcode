class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
            if(nums[i]==0){
                cnt++;
            }
        }
        if(xor!=0){
            return n;
        }
        else{
            if(cnt==n) return 0;
        }
        return n-1;
    }
}