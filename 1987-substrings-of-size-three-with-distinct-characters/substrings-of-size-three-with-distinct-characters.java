class Solution {
    public int countGoodSubstrings(String s) {
        // int count=0;
        // for(int i=0;i<=s.length()-3;i++){
        //     char a=s.charAt(i);
        //     char b = s.charAt(i+1);
        //     char c=s.charAt(i+2);

        //     if(a!=b && b!=c && c!=a){
        //         count++;
        //     }
        // }
        // return count;

        //using set

        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<=s.length()-3;i++){
            set.clear();//as each time we have to add and check
            set.add(s.charAt(i));
            set.add(s.charAt(i+1));
            set.add(s.charAt(i+2));

            if(set.size()==3){
                count++;
            }
        }
        return count;
    }
}