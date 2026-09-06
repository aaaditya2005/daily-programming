class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        int n = s.length();
        if(n==1) return false;
        if(s.charAt(i)=='}' || s.charAt(i)==']' || s.charAt(i)==')') return false;
        st.push(s.charAt(i++));

        while(i<n){
            char ch = s.charAt(i++);
            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else{
                if(st.size()==0) return false;
                char top = st.pop();
                if(ch==')'){
                    if(top!='(') return false;
                }else if(ch==']'){
                    if(top!='[') return false;
                }else{
                    if(top!='{') return false;
                }
            }
        }
        if(st.size()!=0) return false;
        return true;
    }
}