class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> st=new ArrayDeque<>();
        int n=operations.length;
        for(int i=0;i<n;i++){
            String s=operations[i];
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(st.peek()*2);

            }
            else if(s.equals("+")){
                int first=st.pop();
                int sec=st.peek();
                st.push(first);
                st.push(first+sec);
            }
            else{
                int num=Integer.parseInt(s);
                st.push(num);
            }
        }
        int sum=0;
        for(int val:st){
            sum+=val;
        }
        return sum;
    }
}