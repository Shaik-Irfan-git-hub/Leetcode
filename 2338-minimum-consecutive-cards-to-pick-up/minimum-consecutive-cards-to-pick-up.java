class Solution {
    public int minimumCardPickup(int[] cards) {
        int n=cards.length;
        int left=0;
        int min=Integer.MAX_VALUE;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            while(set.contains(cards[i])){
                min=Math.min(min,i-left+1);
                set.remove(cards[left]);
                left++;
            }
            set.add(cards[i]);
        }
        return min==Integer.MAX_VALUE ? -1 : min ;
    }
}