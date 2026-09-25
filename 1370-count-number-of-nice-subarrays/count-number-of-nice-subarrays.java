class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int cnt=0;
        int prefix=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0) prefix++;
            int target=prefix-k;
            if(map.containsKey(target)){
                cnt+=map.get(target);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return cnt;
    }
}