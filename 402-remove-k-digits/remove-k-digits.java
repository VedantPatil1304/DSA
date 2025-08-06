class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();

        for(char c:num.toCharArray()){
            while(k>0 && !st.isEmpty() && st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
        }

        //edge case like "12345" where there is inc order and thus we cant remove any elements 
        // in this type of cases we will remove k digits from the last

        //this means even after complete for loop k is still greater than zero
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

        return sb.length()==0? "0" : sb.toString();
    }
}