class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //new
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            //1st condition
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            //2nd condition
            else if(arr[mid]>arr[mid+1]){
                end=mid;
            }
        }
        //when loop breaks both start and end point to the greatest number 
        return start;//or you can also return end
    }
}