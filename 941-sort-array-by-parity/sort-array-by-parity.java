class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int arr[]=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(i%2==0){
                list.add(i);
            }
        }
        for(int i:nums){
            if(i%2!=0){
                list.add(i);
            }
        }

        for(int i=0;i<nums.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
        
    }
}