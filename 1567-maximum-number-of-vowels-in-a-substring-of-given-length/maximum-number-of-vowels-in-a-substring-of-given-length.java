class Solution {
    public int maxVowels(String s, int k) {
        char chars[]=s.toCharArray();
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(chars[i])){
                count++;
            }
        }
        int maxCount=count;

        for(int j=k;j<chars.length;j++){
            if(isVowel(chars[j-k])){
                count--;
            }
            if(isVowel(chars[j])){
                count++;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
        
    }



    private boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ;
    }
}