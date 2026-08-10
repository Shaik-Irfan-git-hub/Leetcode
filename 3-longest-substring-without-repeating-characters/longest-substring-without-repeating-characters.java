class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int right=0;
        int n=s.length();
        int max=0;
        for(right=0;right<n;right++){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max=Math.max(max,set.size());
        }
        return max;
    }
}