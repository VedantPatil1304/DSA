import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> result = new ArrayList<>();
        // Arrays.sort(nums);  // Step 1: Sort the array

        // for (int i = 0; i < nums.length - 2; i++) {
        //     // Step 2: Skip duplicate first elements
        //     if (i > 0 && nums[i] == nums[i - 1]) continue;

        //     int target = -nums[i];  // We need nums[j] + nums[k] = -nums[i]
        //     int left = i + 1, right = nums.length - 1;

        //     while (left < right) {
        //         int sum = nums[i] + nums[left] + nums[right];

        //         if (sum == target) {
        //             result.add(Arrays.asList(nums[i], nums[left], nums[right]));
        //             left++;
        //             right--;

        //             // Step 3: Skip duplicate pairs
        //             while (left < right && nums[left] == nums[left - 1]) left++;
        //             while (left < right && nums[right] == nums[right + 1]) right--;
        //         } 
        //         else if (sum < target) {
        //             left++;
        //         } 
        //         else {
        //             right--;
        //         }
        //     }
        // }

        // return result;


        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            //skip duplicates for the first number
            if(i>0 && nums[i]==nums[i-1]) continue;

            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    //skip duplicates for left and right
                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right]==nums[right-1]) right--;

                    left++;
                    right--;

                }
                else if(sum<0){
                    left++;//we need a larger sum
                }
                else{
                    right--;//we need a smaller sum
                }
            }
        }
        return result;
    }
}
