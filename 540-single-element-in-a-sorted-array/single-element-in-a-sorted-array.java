class Solution {
    public int singleNonDuplicate(int[] nums) {
        //this solution is T(c)=O(n)

        int xor=0;
        for( int num:nums){
            xor^=num;
        }
        return xor;



    }
}