class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        ArrayDeque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            String s=tokens[i];
            
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int a=st.pop();
                int b=st.pop();
                if(s.equals("+")) st.push(a+b);
                else if(s.equals("-")) st.push(b-a);
                else if(s.equals("*")) st.push(a*b);
                else st.push(b/a);
            }
            
            else{
                int num=Integer.parseInt(s);
                st.push(num);
            }
        }
        return st.peek();
    }
}