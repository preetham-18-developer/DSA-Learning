class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left =0;
        int product =1;
        int max =0;
    if(k <= 1) return 0;
        for(int right = 0;right < nums.length;right++){
            product *= nums[right];
             
             while(product >= k){
                product /= nums[left];
                left++;
             }
        max += right -left +1;
        }
        return max ;
    }
}