
class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        dfs(root, ans);

        return ans;
    }

    public void dfs(TreeNode root, List<Integer> ans) {
        if (root == null) return;

        // Left
        dfs(root.left, ans);

        // Root
        ans.add(root.val);

        // Right
        dfs(root.right, ans);
    }
}