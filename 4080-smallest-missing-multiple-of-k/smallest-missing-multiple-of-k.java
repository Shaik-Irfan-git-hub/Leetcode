class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int val=0;
        for(int i=k;;i+=k){
            if(!set.contains(i)){
                val=i;
                break;
            }
        }
        return val;
    }
}