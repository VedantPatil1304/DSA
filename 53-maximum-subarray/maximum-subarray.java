class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int n=nums.length;

        int maxSum=Integer.MIN_VALUE;
        int start=0;
        int ansStart=0;
        int ansEnd=0;

        for(int i=0;i<n;i++){
            
            if(sum==0){
                start=i;
            }
            sum+=nums[i];

            if(sum>maxSum){
                maxSum=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}