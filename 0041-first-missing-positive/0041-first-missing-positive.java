class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet <Integer> hs = new HashSet<>();
        int ans = 0;
        int n = nums.length;

        for(int i =0;i<n;i++){
            hs.add(nums[i]);
        }
        int max =0;
        for(int i =0;i<n;i++){
            max = Math.max(max , nums[i]);
        }
        for(int i = 1 ;i <= max ;i++){

            if(!(hs.contains(i))){
                return i;
            }

        }
        ans = max+1;
        return ans ;
    }
}