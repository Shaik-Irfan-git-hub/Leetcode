class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max=0;
        for(int num:set){
            int len=0;
            int x=num;
            if(!set.contains(x-1)){
                while(set.contains(x)){
                    len++;
                    x++;
                }
            }
            max=Math.max(max,len);
        }
        return max;
    }
}