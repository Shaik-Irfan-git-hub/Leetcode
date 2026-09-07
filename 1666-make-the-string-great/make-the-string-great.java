class Solution {
    public String makeGood(String s) {
        ArrayDeque<Character> st=new ArrayDeque<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                char lower=Character.toLowerCase(ch);
                if(!st.isEmpty() && lower==st.peek()){
                    st.pop();
                    continue;
                }
            }
            if(Character.isLowerCase(ch)){
                char upper=Character.toUpperCase(ch);
                if(!st.isEmpty() && upper==st.peek()){
                    st.pop();
                    continue;
                }
            }
            st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}