class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char ope = '+';
        for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {

                if (ope == '+') {
                    stack.push(num);
                }

                else if (ope == '-') {
                    stack.push(-num);
                }

                else if (ope == '*') {
                    stack.push(stack.pop() * num);
                }

                else if (ope == '/') {
                    stack.push(stack.pop() / num);
                }

                ope = ch;
                num = 0;
            }
        }
            int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}