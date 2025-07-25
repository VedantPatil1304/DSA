// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {

//         //deciding the range of the answers - which is from 1 to the max element of the array 
//         //as if koko eats the maxElement no.of bananas per hr it gives the min possible hours 
//         //and it remains same after it for all elements but we want the min possible integer 
//         //where she can eat all in given time hours 
//         //so the range becomes 1-maxElement

//         int low=1;
//         int high=maxElement(piles);
//         // int ans=Integer.MAX_VALUE;
//         int ans=high;
//         while(low<=high){
//             int mid=low+(high-low)/2;

//             int totalHours=calculatetotalHours(piles,mid);

//             if(totalHours<=h){
//                 //this means we found a rate at which koko eats bananas before time but as we want min 
//                 //so we move left to check for min and eliminate right part as it will have larger values
//                 ans=mid;
//                 high=mid-1;
//             }
//             else{
//                 //means we are at element which is smaller and thus gives rate greater than h so move right
//                 low=mid+1;
//             }
//         }
//         return ans;
        
//     }

 
//     private int calculatetotalHours(int []arr, int hourlyrate){
//         int totalHours=0;
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             // totalHours+=(int) Math.ceil((double)arr[i]/hourlyrate);
//              totalHours += (arr[i] + hourlyrate - 1) / hourlyrate; 
//         }
//         return totalHours;

//     }

//     private int maxElement(int []arr){
//         int maxE=arr[0];
//         for(int i:arr){
//             if(i>maxE){
//                 maxE=i;
//             }
//         }
//         return maxE;
//     }
// }
class Solution {
    public long calhrs(int[] piles, int mid) {
        long tot = 0;
        for (int i = 0; i < piles.length; i++) {
            tot += (piles[i] + mid - 1) / mid;  // avoids using Math.ceil
        }
        return tot;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int low = 1, high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = calhrs(piles, mid);  // Use long here

            if (total > h) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}