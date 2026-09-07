class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int n1=needle.length();
        int index=-1;
        int j=0;
        int cnt=0;
        if(n1>n) return -1;
        for(int i=0;i<n;i++){
            char h=haystack.charAt(i);
            
            if(j<n1 && h==needle.charAt(j)){
                cnt++;
                j++;
                if(cnt==n1){
                    return i-n1+1;
                }
            }
            else{
                if(j>0){
                    i=i-j;
                }
                cnt=0;
                j=0;
            }
            
        }
        
        return -1;
        
    }
}