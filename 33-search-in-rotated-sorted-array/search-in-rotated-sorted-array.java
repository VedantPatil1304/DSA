class Solution {
    public int search(int[] arr, int target) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target) return mid;

            //checking if left half is the sorted one
            if(arr[low]<=arr[mid]){
                //checking if the target lies in this part 
                if(arr[low]<=target && target<=arr[mid]){
                    //if it lies here then we eliminate the right half
                    high=mid-1;
                }
                else{
                    //if the element doesnt exist here eliminate this half and go to right half 
                    low=mid+1;

                }
            }
            //if not in left part element will exist in right part as 1 part is always sorted
            else{
                //check if element exists in this half 
                if(arr[mid]<=target && target<=arr[high]){
                    //if yes then eliminate the left half
                    low=mid+1;
                }
                else{
                    //if it doesnt exist eliminate that right part
                    high=mid-1;
                }

            }
        }
        return -1;
    }
}