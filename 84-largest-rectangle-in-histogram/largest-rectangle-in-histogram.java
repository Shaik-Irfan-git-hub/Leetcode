class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        ArrayDeque<Integer> st=new ArrayDeque<>();
        int[] left=new int[n];
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(i);
                left[i]=-1;
            }
            else{
                while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()) left[i]=-1;
                else left[i]=st.peek();
                st.push(i);
            }
            System.out.print(left[i]+" ");
        }
        st.clear();
        int[] right=new int[n];
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(i);
                right[i]=n;
            }
            else{
                while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()) right[i]=n;
                else right[i]=st.peek();
                st.push(i);
            }
            System.out.print(right[i]+" ");
        }
        int max=0;
        int len=0;
        for(int i=0;i<n;i++){
            len=(right[i]-left[i]-1)*heights[i];
            max=Math.max(max,len);
        }
        return max;

    }
}