class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int cnt=0;
        for(int i=0;i<k;i++){
            char ch=blocks.charAt(i);
            if(ch=='W'){
                cnt++;
            }
        }
        int min=cnt;
        for(int i=k;i<n;i++){
            char ch=blocks.charAt(i);
            char ch1=blocks.charAt(i-k);
            if(ch=='W'){
                cnt++;
            }
            if(ch1=='W'){
                cnt--;
            }
            min=Math.min(min,cnt);
        }
        return min;
    }
}