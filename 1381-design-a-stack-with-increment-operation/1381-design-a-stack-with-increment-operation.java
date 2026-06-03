class CustomStack {
            int[] stack;
            int[] inc;

            int max;
            int index;

    public CustomStack(int maxSize) {
        max = maxSize;
        stack = new int[max];
        inc = new int[max];
        index = -1;

    }
    
    public void push(int x) {
        if(index == max-1){
            return ;
        }
    
          index++;
          stack[index] = x;
        
    }
    
    public int pop() {
        if(index == -1){
            return -1;
        }
        int ans = stack[index] + inc[index];
        if(index > 0){
            inc[index-1] += inc[index];
        }
            inc[index] = 0;
            index--;
        
        return ans;
    }
    
    public void increment(int k, int val) {
        int ind = Math.min(k-1 , index);
        if(ind >= 0){
            inc[ind] += val;
        }
    }
}

