class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;

        int s=0;//to check for the last unique element

        for(int f=1;f<n;f++){
            if(nums[f]!=nums[s]){
                s++;
                nums[s]=nums[f];
            }
        }
        return s+1;//as s will be where the last unique element will be
    }
}