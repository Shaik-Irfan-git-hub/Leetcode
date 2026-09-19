class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=0;j<strs[i].length();j++){
                char ch=strs[i].charAt(j);
                freq[ch-'a']++;
            }
            String key=Arrays.toString(freq);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                ArrayList<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            }
        }
        
        return new ArrayList<>(map.values());
    }
}