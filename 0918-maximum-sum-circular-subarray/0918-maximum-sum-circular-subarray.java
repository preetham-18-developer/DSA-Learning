class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum =0 ;
        int n = nums.length;
        int max =nums[0];
        int min = nums[0];
        int currmax =0;
        int currmin =0 ;
        for(int num : nums){
            currmax = Math.max(num , currmax +num);
            max =Math.max(max, currmax) ;

            currmin = Math.min(num , currmin +num);
            min = Math.min(min , currmin);

            sum += num;
        }
       if(max < 0) return max;
        max = Math.max(max , sum - min);
        return max;
            }
}