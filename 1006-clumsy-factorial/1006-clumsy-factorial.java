import java.util.*;

class Solution {
    public int clumsy(int n) {

        Stack<Integer> st = new Stack<>();

        st.push(n);

        n--;

        int operation = 0;

        while (n > 0) {

            if (operation == 0) {
                
                int last = st.pop();
                st.push(last * n);
            }

            else if (operation == 1) {
               
                int last = st.pop();
                st.push(last / n);
            }

            else if (operation == 2) {
            
                st.push(n);
            }

            else {
               
                st.push(-n);
            }

            operation = (operation + 1) % 4;

            n--;
        }

        int answer = 0;

        while (!st.isEmpty()) {
            answer += st.pop();
        }

        return answer;
    }
}