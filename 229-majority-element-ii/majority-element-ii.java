class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;

        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> result=new ArrayList<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                result.add(key);
            }
        }
        
        // int []arr=new int[result.size()];
        // for(int i=0;i<result.size();i++){
        //     arr[i]=list.get(i);
        // }
        // return arr;

        return result;
    }
}