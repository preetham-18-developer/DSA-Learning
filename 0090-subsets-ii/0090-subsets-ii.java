class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        solve(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    private void solve(int[] nums, int i,
                       List<Integer> path,
                       List<List<Integer>> ans) {

        // Every path is a subset
        ans.add(new ArrayList<>(path));

        for (int j = i; j < nums.length; j++) {

            // Skip duplicate choices at the same level
            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }

            // TAKE
            path.add(nums[j]);

            solve(nums, j + 1, path, ans);

            // BACKTRACK
            path.remove(path.size() - 1);
        }
    }
}