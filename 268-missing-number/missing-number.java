class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // int sum=(n*(n+1))/2;
        // int sum2=0;
        // for(int i=0;i<n;i++){
        //     sum2+=nums[i];
        // }
        // return sum-sum2;

        //using xor 

        int n=nums.length;
        int xor=0;

        //what xor does is it cancels out all the duplicate elements or the ones that arrive 2 times

        //first we xor all the elements that are present in the array
        for(int num:nums){
            xor^=num;
        }
        
        //now we will xor all the numbers that should be present in that range 
        //that is from 0/1 to n(length of array) this will include all numbers along wiht the missing number 
        //all the other elements will cancel out and only the missing element will remain as it occurs only once
        //and all the other elements occur twice in the first loop and second but missing one occurs only in secon

        for(int i=0;i<=n;i++){
            xor^=i;
        }
        return xor;
    }
}