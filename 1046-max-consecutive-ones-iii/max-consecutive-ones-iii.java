class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int maxLen=0;
        int zeroes=0;

        while(r<nums.length){
            if(nums[r]==0){
                zeroes++;
            }
            //in any substring the max no.of 0 allowed is k as we can flip them to 1
            while(zeroes>k){
                //we shrink the substring from left
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}