// class Solution {
//     public int maxVowels(String s, int k) {
//         char chars[]=s.toCharArray();
//         int count=0;
//         for(int i=0;i<k;i++){
//             if(isVowel(chars[i])){
//                 count++;
//             }
//         }
//         int maxCount=count;

//         for(int j=k;j<chars.length;j++){
//             if(isVowel(chars[j-k])){
//                 count--;
//             }
//             if(isVowel(chars[j])){
//                 count++;
//             }
//             maxCount=Math.max(maxCount,count);
//         }
//         return maxCount;
        
//     }



//     private boolean isVowel(char c){
//         c=Character.toLowerCase(c);
//         return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ;
//     }
// }

class Solution{
    public int maxVowels(String s, int k){
         int count = 0, max = 0;
    Set<Character> vowels = Set.of('a','e','i','o','u');

    for (int i = 0; i < s.length(); i++) {
        if (vowels.contains(s.charAt(i))) count++;

        // Shrink window if larger than k
        if (i >= k && vowels.contains(s.charAt(i - k))) {
            count--;
        }

        max = Math.max(max, count);
    }

    return max;
    }
}
