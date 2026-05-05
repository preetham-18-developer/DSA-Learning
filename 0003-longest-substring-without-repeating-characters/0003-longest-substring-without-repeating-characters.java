class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left =0;
        int max=0;

        for(int i =0;i<s.length();i++){
            char a = s.charAt(i);
            map.put(a , map.getOrDefault(a,0)+1);
            
            while(map.get(a) > 1) 
            {
               char leftchar = s.charAt(left);
               map.put(leftchar , map.get(leftchar) -1);
               left++;
            }
            max = Math.max(max , i -left +1);
        }
        return max;
    }
}