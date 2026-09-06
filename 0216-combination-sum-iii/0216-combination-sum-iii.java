class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans = new ArrayList<>();

        solve(1 , k , n , ans , new ArrayList<>(),0);

        return ans;
    }

    private static void solve(int start , int range , int target , List<List<Integer>> ans , List<Integer> path,int sum){

        if(path.size() == range){
                if(sum == target){
                    ans.add(new ArrayList<>(path));
                }
        }

        for(int i=start;i<=9;i++){

        path.add(i);
        
        solve(i+1, range,target,ans,path,sum+i);

        path.remove(path.size() - 1);
        }

    }
}