class Solution {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            //left side array part is sorted
            if(nums[low]<=nums[mid]){
                min=Math.min(min,nums[low]);
                low=mid+1;
            }
            //if the right side part array is sorted then mid becomes the first element so it will be the 
            //minimum of all elements at the right side
            else{
                min=Math.min(min,nums[mid]);
                high=mid-1;
            }

        }
        return min;
    }
}