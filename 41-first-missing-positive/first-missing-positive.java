class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        long max=0;
        for(int i=0;i<n;i++){
            
            max=Math.max(max,nums[i]);
            set.add(nums[i]);
        }
        
        int num=1;
        for(int i=1;i<=max+1;i++){
            if(!set.contains(i)){
                num=i;
                break;
            }
        }
        return num;

    }
}