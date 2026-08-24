class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        
        
        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Integer[] key = new Integer[map.size()];
        int j=0;
        for(int keys:map.keySet()){
            key[j]=keys;
            j++;
        }
        Arrays.sort(key, (a, b) -> map.get(b) - map.get(a));
        for(int i=0;i<k;i++){
            ans[i]=key[i];
        }
        
        return ans;
    }
}