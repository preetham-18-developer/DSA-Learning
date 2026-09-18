class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();

        int sum =0;

        for(String  op : operations){
            
            if(!op.equals("C") && !op.equals("D") && !op.equals("+")){
                st.push(Integer.parseInt(op));
            }
            else if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(st.peek() * 2);
            }
            else if(op.equals("+")){
                int last = st.pop();
                sum = last + st.peek();
                st.push(last);
                st.push(sum);
            }
        }
        int result = 0;

        while(!st.isEmpty()){
             result += st.pop();
        }

        return result;
    }
}