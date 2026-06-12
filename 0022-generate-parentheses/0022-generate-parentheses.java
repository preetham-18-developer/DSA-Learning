class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("", 0, 0, n, result);
        return result;
    }

    private void generate(String current, int open, int close,
                          int n, List<String> result) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add opening bracket if available
        if (open < n) {
            generate(current + "(", open + 1, close, n, result);
        }

        // Add closing bracket only if valid
        if (close < open) {
            generate(current + ")", open, close + 1, n, result);
        }
    }
}

