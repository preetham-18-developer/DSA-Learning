class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            int product =nums[i];
            
            if(product < 0){
                int temp =max;
                max =min;
                min = temp;
            }
            max = Math.max(product , product * max);
            min = Math.min(product , product * min);
            ans = Math.max(ans , max);
        }
        return ans;
    }
}