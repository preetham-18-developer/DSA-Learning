class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        char[] chars = s.toCharArray();

        int ans = 0;

        stack.push(-1);

        for(int i = 0; i < s.length(); i++) {

            char a = chars[i];

            if(a == '(') {
                stack.push(i);
            }
            else {

                stack.pop();

                if(stack.isEmpty()) {
                    stack.push(i);
                }
                else {
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }

        return ans;
    }
}