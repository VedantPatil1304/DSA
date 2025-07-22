class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // int arr[]=new int[nums.length];
        // List<Integer> list=new ArrayList<>();
        // for(int i:nums){
        //     if(i%2==0){
        //         list.add(i);
        //     }
        // }
        // for(int i:nums){
        //     if(i%2!=0){
        //         list.add(i);
        //     }
        // }

        // for(int i=0;i<nums.length;i++){
        //     arr[i]=list.get(i);
        // }
        // return arr;
        

        //optimised 2 ptr approach

        int l=0, r=nums.length-1;
        while(l<r){
            if(nums[l]%2==0){
                l++;
            }
            else if(nums[r]%2!=0){
                r--;
            }
            else{
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
            }

        }
        return nums;
    }
}