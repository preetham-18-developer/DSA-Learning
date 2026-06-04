class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> stack = new Stack<>();

        char c[] = num.toCharArray();
        for(int i=0;i<num.length();i++){
             while(!stack.isEmpty() && k>0 && (stack.peek()-'0' > c[i]-'0')){
                stack.pop();
                k--;
            }
            stack.push(c[i]);
        }
        while(k > 0){ 
            stack.pop() ;
            k--;
        }
        if(stack.isEmpty()) return "0";

        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res = res.append(stack.pop());
        }
        while(res.length() > 0 && res.charAt(res.length() - 1) == '0'){
                res.deleteCharAt(res.length()-1);
        }
            res.reverse();

            if(res.length() == 0) return "0";

            return res.toString();
    }
}