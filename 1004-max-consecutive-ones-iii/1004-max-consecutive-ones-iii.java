class Solution {
    public int longestOnes(int[] nums, int k) {
        int countzero =0 ;
        int left =0;
        int n =nums.length;

        for(int right =0;right<n;right++){
            if(nums[right] == 0){
                countzero++;
            }
            if(countzero > k){
                if(nums[left] == 0){
                    countzero--;
                }
                left++;
            }
        }
        return n-left;
    }
}