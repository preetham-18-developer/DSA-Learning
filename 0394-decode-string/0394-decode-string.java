class Solution {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String cur = "";
        int num = 0;

        for(char ch : s.toCharArray()) {

            if(Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if(ch == '[') {
                countStack.push(num);
                stringStack.push(cur);

                num = 0;
                cur = "";
            }

            else if(ch == ']') {

                int repeat = countStack.pop();
                String prev = stringStack.pop();

                StringBuilder sb = new StringBuilder(prev);

                for(int i = 0; i < repeat; i++) {
                    sb.append(cur);
                }

                cur = sb.toString();
            }

            else {
                cur += ch;
            }
        }

        return cur;
    }
}