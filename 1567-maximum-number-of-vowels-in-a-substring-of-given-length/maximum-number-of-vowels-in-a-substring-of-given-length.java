class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int cnt=0;
        
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                cnt++;
            }
            
        }
        int max=cnt;
        for(int i=k;i<n;i++){
            char ch=s.charAt(i);
            char ch1=s.charAt(i-k);
            if(ch1=='a' || ch1=='e'|| ch1=='i'|| ch1=='o'|| ch1=='u'){
                cnt--;
            }
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){   
                cnt++;
            }
            max=Math.max(max,cnt);
        }

        return max;
    }
}