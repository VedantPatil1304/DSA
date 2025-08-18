class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> sTot=new HashMap<>();
        HashMap<Character , Character> tTos=new HashMap<>();

        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);

            if(sTot.containsKey(sc)){
                if(sTot.get(sc)!=tc) return false;
            }
            else{
                sTot.put(sc,tc);
            }

            if(tTos.containsKey(tc)){
                if(tTos.get(tc)!=sc) return false;
            }
            else{
                tTos.put(tc,sc);
            }
        }
        return true;
    }
}