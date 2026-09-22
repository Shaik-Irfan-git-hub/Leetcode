class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        ArrayDeque<Integer> q1=new ArrayDeque<>();
        ArrayDeque<Integer> q2=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            char ch=senate.charAt(i);
            if(ch=='R') q1.offer(i);
            else q2.offer(i);
        }
        while(!q1.isEmpty() && !q2.isEmpty()){
            if(q1.peek()<q2.peek()){
                q2.poll();
                int idx=q1.poll();
                q1.offer(idx+n);
            }
            else{
                q1.poll();
                int idx=q2.poll();
                q2.offer(idx+n);
            }
        }
        if(q1.isEmpty()) return "Dire";
        return "Radiant";
    }
}