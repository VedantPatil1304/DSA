class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> sTOp=new HashMap<>();
        HashMap<String,Character> pTOs=new HashMap<>();

        String []words=s.split(" ");

        if(pattern.length()!=words.length) return false;

        for(int i=0;i<pattern.length();i++){

            char ch=pattern.charAt(i);
            String word=words[i];

            if(sTOp.containsKey(ch)){
                if(!sTOp.get(ch).equals(word)){
                    return false;
                }
            }
            else{
                sTOp.put(ch,word);
            }

            if(pTOs.containsKey(word)){
                if(!pTOs.get(word).equals(ch)){
                    return false;
                }
            }
            else{
                pTOs.put(word,ch);
            }
        }
        return true;
    }
}
