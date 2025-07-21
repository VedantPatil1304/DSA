class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        //brute force approach

        // int sum1=0,sum2=0;
        // for(int i:aliceSizes){
        //     sum1+=i;
        // }
        // for(int i:bobSizes){
        //     sum2+=i;
        // }

        // for(int i=0;i<aliceSizes.length;i++){
        //     for(int j=0;j<bobSizes.length;j++){
        //         if(sum1-aliceSizes[i]+bobSizes[j]==sum2-bobSizes[j]+aliceSizes[i]){
        //             return new int[]{aliceSizes[i],bobSizes[j]};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};


        //optimized approach

        int sum1=0,sum2=0;
        for(int i:aliceSizes){
            sum1+=i;
        }
        for(int i:bobSizes){
            sum2+=i;
        }       

        int x=(sum1-sum2)/2;

        HashSet<Integer> set=new HashSet<>();
        for(int i:bobSizes){
            set.add(i);
        } 

        for(int a:aliceSizes){
            int b=a-x;
            if(set.contains(b)){
                return new int[]{a,b};
            }
        }
        return new int[]{-1,-1};

    }
}