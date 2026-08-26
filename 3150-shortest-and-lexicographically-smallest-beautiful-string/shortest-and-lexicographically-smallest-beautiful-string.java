class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        String ans="";
        int ones=0;
        int min=Integer.MAX_VALUE;
        int left=0;
        for(int right=0;right<n;right++){
            if(s.charAt(right)=='1'){
                ones++;
            }
            while(ones>k){
                if(s.charAt(left)=='1'){
                    ones--;
                }
                left++;
            }
            if(ones==k){
                while(s.charAt(left)=='0'){
                    left++;
                }
                String current=s.substring(left,right+1);
                if(current.length()<min){
                    ans=current;
                    min=current.length();
                }
                else if(current.length()==min){
                    if(current.compareTo(ans)<0){
                        ans=current;
                    }
                }
            }
        }
        return ans;
    }
}