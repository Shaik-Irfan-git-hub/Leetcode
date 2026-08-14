class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        int i=0;
        
        for(int j=0;j<n;j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char rem=s.charAt(i);
                map.put(rem,map.get(rem)-1);
                if(map.get(rem)==0){
                    map.remove(rem);
                }
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}