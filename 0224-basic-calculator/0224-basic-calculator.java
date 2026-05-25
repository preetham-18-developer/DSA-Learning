class Solution {
    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();

        int res = 0;
        int pre = 0;
        int sign = 1;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                pre = pre * 10 + (c - '0');
            } 
            else if (c == '+') {
                res += pre * sign;
                sign = 1;
                pre = 0;
            } 
            else if (c == '-') {
                res += pre * sign;
                sign = -1;
                pre = 0;
            } 
            else if (c == '(') {
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
                pre = 0;
            } 
            else if (c == ')') {
                res += pre * sign;
                pre = 0;
                res *= stack.pop();
                res += stack.pop();
            }
        }

        res += sign * pre;
        return res;
    }
}