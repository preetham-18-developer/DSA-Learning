class Solution {
    public int minLength(String s) {
        Stack <Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a = chars[i];

            if(stack.isEmpty()){
                stack.push(a);
                continue;
            }
            if(a == 'B' && stack.peek() == 'A'){
                stack.pop();
            }
            else if(a == 'D' && stack.peek() == 'C'){
                stack.pop();
            }
            else{
                stack.push(a);
            }
        }
        return stack.size();
    }
}