class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();

        for(char c : num.toCharArray()){
            while(k>0 && !st.isEmpty() && st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
        }

        //edge case 12345
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }       

        //building result
        StringBuilder sb=new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        } 
        sb.reverse();

        //removing leading zeroes
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        if(sb.length()==0){
            return "0";
        }
        return sb.toString();
    }
}