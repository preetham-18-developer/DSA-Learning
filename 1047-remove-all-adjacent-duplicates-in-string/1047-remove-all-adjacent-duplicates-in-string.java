class Solution {
    public String removeDuplicates(String s) {

        Stack <Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] chars=s.toCharArray();

        for(int i=0;i<s.length();i++){
            char a = chars[i];

            if(!stack.isEmpty() && a == stack.peek()) {
                stack.pop();
            }
            else{
                stack.push(a);
               
            }
            
        }
        for(char c : stack){
            sb.append(c);
        }

return sb.toString();
    }
}