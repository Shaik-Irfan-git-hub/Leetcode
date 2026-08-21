class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int dif=0;
            if(map.containsKey(nums[i])){
                dif=Math.abs(map.get(nums[i])-i);
                if(dif<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}