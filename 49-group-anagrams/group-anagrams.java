class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //the sorted form of all anagrams is same

        Map<String , List<String>> map=new HashMap<>();

        for(String word:strs){
            char []chars=word.toCharArray();
            Arrays.sort(chars);
            String sortedKey=new String(chars);

            if(!map.containsKey(sortedKey)){
                map.put(sortedKey,new ArrayList<>());
            }
            map.get(sortedKey).add(word);
        }
        return new ArrayList<>(map.values());
    }

}