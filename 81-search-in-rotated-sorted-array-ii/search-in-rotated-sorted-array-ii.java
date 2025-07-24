class Solution {
    public boolean search(int[] arr, int target) {
        
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target) return true;

            //handling the edge case if the fisrt and last elements are equal to mid we cut them out
            // as we wont be able to find the sorted part and also if mid is not equal to target then they 
            //too wont be equal so we can cut them off

            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low+=1;
                high-=1;
                continue;// to cut off till they are equal (continue means start form first)
            }

            //our regular code to search in sorted and rotated array ( it can also handle cases 
            // of duplicates included just not the edge case)

            if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }

        }
        return false;
    }
}