class Solution {
    public boolean checkDivisibility(int n) {
        int m=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int ld=n%10;
            sum+=ld;
            prod*=ld;
            n/=10;
        }
        return m%(sum+prod)==0;
    }
}