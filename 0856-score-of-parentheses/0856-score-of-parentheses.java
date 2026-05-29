class Solution {
    public int scoreOfParentheses(String s) {
        Stack <Character> stack = new Stack<>();

        int ans =0;

        char[] chars=s.toCharArray();

        for(int i=0;i<s.length();i++){

            char a = chars[i];

            if(a == '('){
                stack.push(a);
            }
            else{
                stack.pop();

                if(chars[i-1] == '('){
                    ans += (int) Math.pow(2, stack.size());
                }
            }
        }
        return ans;

    }
}