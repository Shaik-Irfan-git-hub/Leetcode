class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int k=p.length();
        List<Integer> list=new ArrayList<>();
        HashMap<Character,Integer> mapp=new HashMap<>();
        HashMap<Character,Integer> maps=new HashMap<>();
        if(k>n) return list;
        for(int i=0;i<k;i++){
            char ch=p.charAt(i);
            mapp.put(ch,mapp.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            maps.put(ch,maps.getOrDefault(ch,0)+1);
        }
        if(mapp.equals(maps)){
            list.add(0);
        }
        
        for(int i=k;i<n;i++){
            char ch=s.charAt(i);
            char remove=s.charAt(i-k);
            maps.put(ch,maps.getOrDefault(ch,0)+1);
            maps.put(remove,maps.get(remove)-1);
            if(maps.get(remove)==0){
                maps.remove(remove);
            }
            
            if(mapp.equals(maps)){
                list.add(i-k+1);
            }
            
        }
        return list;
    }
}