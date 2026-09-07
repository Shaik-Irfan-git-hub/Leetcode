class Solution {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> st=new ArrayDeque<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch==st.peek()){
                st.pop();
            }
            else st.push(ch);
        }
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}