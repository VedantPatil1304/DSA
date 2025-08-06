class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st=new ArrayDeque<>();
        for(int a:asteroids){

            //when the asteroid is positive 
            if(a>0){
                st.push(a);
            }
            //when the asteroid is negative
            else{
                //while(till) the stack's top is positive and its value is smaller than abs value of current 
                //-ve asteroid , it explodes and thus pop it out of stack
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(a)){
                    st.pop();
                }

                //if they are equal in size both will explode
                if(!st.isEmpty() && st.peek()==Math.abs(a)){
                    st.pop();
                }
                //if stack is empty or stacks top is -ve then only push the -ve element in stack
                else if(st.isEmpty() || st.peek()<0){
                    st.push(a);
                }
                // If the current left-moving asteroid is smaller, it is destroyed by the larger right-moving 
                // asteroid, and we do not add it to the list (handled implicitly by not adding it to the list).
        }
        }

        //now convert the stack into req array

        //since when we pop from stack it is last element that comes first so we have to flip when we make the array 
        int []result=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            result[i]=st.pop();
        }

        return result;
    }
}