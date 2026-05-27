class Solution {
    public String makeGood(String s) {
        Stack <Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i =0;i<s.length();i++){
                char a = chars[i];
                if(!stack.isEmpty() && Math.abs(stack.peek() - a) == 32){
                    stack.pop();
                }

                else {
                    stack.push(a);
                }
        }
    
        for(char c : stack){
            sb.append(c);
        }
    
       return sb.toString();
    }
}
