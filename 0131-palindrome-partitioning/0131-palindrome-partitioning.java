class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> ans = new ArrayList<>();
        solve(s , 0 ,new ArrayList<>(),ans);
        return ans;
    }

    private static void solve(String s , int index , List<String> path ,List<List<String>> ans){

        if(index == s.length()){
                ans.add(new ArrayList<>(path));
                 return;
            }
        

            for(int i = index;i<s.length();i++){

                     String part = s.substring(index , i+1);
                     if(Ispalidrome(part)){
                        path.add(part);

                        solve(s , i + 1,path,ans);

                        path.remove(path.size() - 1);
                     }
            }
    }

    private static boolean Ispalidrome(String s){
        int start = 0;
        int end = s.length()-1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}