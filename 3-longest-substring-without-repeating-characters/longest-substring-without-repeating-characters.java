class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        Set<Character> set=new HashSet<>();
        int left=0;

        for(int right=0;right<s.length();right++){
            char currentChar=s.charAt(right);
            while(set.contains(currentChar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);
            maxLen=Math.max(maxLen,right-left+1);

        }
        return maxLen;
    }
}