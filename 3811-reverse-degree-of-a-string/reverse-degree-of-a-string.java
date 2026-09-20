class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
       
        int sum=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int rev=26-(ch-'a');
            sum+=rev*(i+1);
        }
        return sum;
    }
}