class Solution {
    public int countCommas(int n) {
        int m=n;
        int cnt=0;
        while(n>0){
            n/=10;
            cnt++;
        }
        if(cnt<=3) return 0;
        return m-1000+1;
    }
}