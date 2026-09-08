class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayDeque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n2;i++){
            if(st.isEmpty()){
                st.push(nums2[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()<=nums2[i]){
                    map.put(st.peek(),nums2[i]);
                    st.pop();
                }
                st.push(nums2[i]);
            }
        }
        int[] arr=new int[n1];
        for(int i=0;i<n1;i++){
            arr[i] = map.getOrDefault(nums1[i], -1);
        }
        return arr;
    }
}