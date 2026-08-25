class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Set<List<Integer>> set=new HashSet();
        Arrays.sort(nums);
        int i=0;
        int j=1;
        while(j<n-2){
            long sum=nums[i]+nums[j];
            long t=target-sum;
            int left=j+1;
            int right=n-1;
            while(left<right){
                if(nums[left]+nums[right]==t){
                    set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if((nums[left]+nums[right])>t) right--;
                else left++;
            }
            j++;
            if(j==n-2 && i<n-3){
                i++;
                j=i+1;
            }
        }
        return new ArrayList<>(set);
    }
}