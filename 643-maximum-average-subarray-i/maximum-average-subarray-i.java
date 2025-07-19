class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum=0;
        //first window
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        int maxSum=windowSum;

        //slide 
        for(int j=k;j<nums.length;j++){
            windowSum+=nums[j]-nums[j-k];
            maxSum=Math.max(windowSum,maxSum);
        }
        return (double) maxSum/k;
    }
}