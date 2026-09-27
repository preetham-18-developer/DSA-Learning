class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0) return 0;
        Arrays.sort(nums);

        int ans = 1;
        int pres =1;

        for(int i=1;i<nums.length;i++){

            if(nums[i] == nums[i-1]){
                continue;
            }
            if( nums[i-1] == nums[i] - 1){
                ans++;
            }
            else{
                ans = 1;
            }

            pres = Math.max(pres , ans);
        }
        return pres;
    }
}