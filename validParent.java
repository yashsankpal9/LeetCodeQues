class Solution {
    public boolean isValid(String s1) {
        Stack<String> st = new Stack<>();
        String[] ss = s1.split("");

        for(String s:ss){
            if(s.equals("(")||s.equals("[")||s.equals("{")) st.push(s);
            else if(st.empty() || s.equals(")") && !st.peek().equals("(") || s.equals("]") && !st.peek().equals("[") || s.equals("}") && !st.peek().equals("{") ) return false;
            else st.pop();
        }

        return st.empty();
        Math.s
    }
}

