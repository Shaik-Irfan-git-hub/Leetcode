class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayDeque<Integer> st=new ArrayDeque<>();
        int days=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(st.isEmpty()){
                st.push(i);
            }
            else{
                while(!st.isEmpty() &&temperatures[st.peek()]<temperatures[i]){
                    int prevIndex=st.pop();
                    arr[prevIndex]=i-prevIndex;
                }
                st.push(i);
            }
        }
        return arr;
    }
}