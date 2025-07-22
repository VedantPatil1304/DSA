class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int rows=matrix.length;
        // int cols=matrix[0].length;

        // int r=0;
        // int c=cols-1;

        // while(r<rows && c>=0){
        //     if(matrix[r][c]==target){ // top right corner element
        //         return true;
        //     }
        //     else if(matrix[r][c]>target){
        //         c--;
        //     }
        //     else{
        //         r++;
        //     }
        // }
        // return false;

        // using binary search for T(c)=O(log(m * n)) as given


        int m=matrix.length;
        int n=matrix[0].length;

        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            int row=mid/n;
            int col=mid%n;

            int val=matrix[row][col];

            if(val==target){
                return true;
            }
            else if(val<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}