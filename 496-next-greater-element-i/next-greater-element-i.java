class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n=nums2.length;

       Stack<Integer> st=new Stack<>();

       HashMap<Integer,Integer> ngeMap=new HashMap<>();

        //traversing ulta in nums2
       for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ngeMap.put(nums2[i],-1);
            }
            else{
                ngeMap.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
       }

       //build answer for req nums1 from map
       int []ans=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){

            ans[i]=ngeMap.get(nums1[i]);
       }
       return ans;
    }
}