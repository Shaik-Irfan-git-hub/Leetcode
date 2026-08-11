class Solution {
    public int minimumCardPickup(int[] cards) {
        int n=cards.length;
        int left=0;
        int min=Integer.MAX_VALUE;
        HashSet<Integer> set=new HashSet<>();
        boolean dup=true;
        for(int i=0;i<n;i++){
            while(set.contains(cards[i])){
                min=Math.min(min,i-left+1);
                set.remove(cards[left]);
                left++;
                dup=false;
            }
            set.add(cards[i]);
        }
        if(dup) return -1;
        return min;
    }
}