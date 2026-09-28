class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        ArrayDeque<Integer> q=new ArrayDeque<>();
        
        for(int i=0;i<k;i++){
            int num=nums[i];
            if(q.isEmpty()) q.offer(i);
            else{
                while(!q.isEmpty() && num>nums[q.peekLast()]){
                    q.pollLast();
                }
                q.offerLast(i);
            }
        }
        int j=0;
        ans[j]=nums[q.peekFirst()];
        j++;
        for(int i=k;i<n;i++){
            if((i-k)==q.peekFirst()){
                q.pollFirst();
            }
            if(q.isEmpty()) q.offerLast(i);    
            else{
                while(!q.isEmpty() && nums[i]>nums[q.peekLast()]){
                    q.pollLast();
                }
                q.offerLast(i);
            }
            ans[j]=nums[q.peekFirst()];
            j++;
        }
        return ans;
    }
}