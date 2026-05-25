class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] chars=s.toCharArray();
        int p1=0;
        int p2 = n-1;
        while(p1 < p2){
            while(p1 < p2 && !isVowel(chars[p1])){
                 p1++;
            }

            while(p1  < p2 && !isVowel(chars[p2])){
                 p2--;
            }
        
        if(p1 < p2){
            char temp = chars[p1];
            chars[p1] = chars[p2];
            chars[p2] = temp;

            p1++;
            p2--;
        }
        }
        return new String(chars);
    }
    private boolean isVowel(char c){
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c =='I' || c == 'o' || c== 'O' || c== 'u' || c=='U';
    }
}