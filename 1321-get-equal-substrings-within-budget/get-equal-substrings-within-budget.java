class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            arr[i]=Math.abs(ch1-ch2);
        }
        int j=0;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>maxCost){
                sum-=arr[j];
                j++;
            }
            max=Math.max(max,i-j+1);

        }
        return max;
    }
}