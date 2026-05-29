class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack <Character> stack =new Stack<>();

        char[] chars = s.toCharArray();

        for(int i=0;i<s.length();i++){
            char a = chars[i];

            if(stack.isEmpty()){
                stack.push(a);
                continue;
            }
            if(stack.peek() == '(' && a == ')'){
                stack.pop();
            }
            // else if(stack.peek() ==')' && a == '('){
            //     stack.pop();
            // }
            else {
                stack.push(a);
            }
        }
        return stack.size();
    }
}