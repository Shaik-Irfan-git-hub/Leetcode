class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        int left=0;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            while(set.contains(nums[i])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            set.add(nums[i]);
            sum+=nums[i];
            max=Math.max(max,sum);
        }
        
        return max;
    }
}