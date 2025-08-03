class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack();

        for(char c :s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){ // no matching opening bracket found
                    return false;
                }
                char top=st.pop();
                if(c==')' && top!='(' || c==']' && top!='[' || c=='}' && top!='{'){
                    return false;
                }

            }
        }
        return st.isEmpty(); // this means if at last if the stack is empty that means each condition is satisfied
    }
}