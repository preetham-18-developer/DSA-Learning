class Solution {
    public int hIndex(int[] citations) {
        
        int ans = 0;
        int j=1;
        int max = 0;
        for(int i=0;i<citations.length;i++){
            max = Math.max(max , citations[i]);
        }
        while(j <= max){
            int count = 0;
            for(int i=0;i<citations.length;i++){
                if(citations[i] >= j){
                    count++;
                }
            }
            if(count >= j){
            ans = Math.max(ans , j);
            }
            j++;
        }
        return ans;
    }
}