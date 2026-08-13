class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int[] unsort=nums.clone();
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        int start=0;
        int end=0;
        while(i<n){
            if(nums[i]!=unsort[i]){
                start=i;
                break;
            }
            i++;
        }
        while(j>=0){
            if(nums[j]!=unsort[j]){
                end=j;
                break;
            }
            j--;
        }
        int len=end-start+1;
        if(start==0 && end==0) return 0;
        return len;
        
    }
}