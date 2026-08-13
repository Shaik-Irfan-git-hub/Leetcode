class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        if(n>m) return false;
        for(int i=0;i<n;i++){
            char ch=s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            char ch=s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
        for(int i=n;i<m;i++){
            char ch=s2.charAt(i);
            char rem=s2.charAt(i-n);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            map2.put(rem,map2.getOrDefault(rem,0)-1);
            if(map2.get(rem)==0){
                map2.remove(rem);
            }
            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }
}