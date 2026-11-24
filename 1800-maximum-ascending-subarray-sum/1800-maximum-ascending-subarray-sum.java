class Solution {
    public int maxAscendingSum(int[] nums) {
        

        int maxi = Integer.MIN_VALUE;
        int i = 0;
        int n =nums.length;
        while (i < n) {

            int sum = nums[i];

            while (i + 1 < n && nums[i] < nums[i + 1]) {
                i++;
                sum += nums[i];
            }

            maxi = Math.max(maxi, sum);

            i++;
        }

     return maxi;
       

    }
}