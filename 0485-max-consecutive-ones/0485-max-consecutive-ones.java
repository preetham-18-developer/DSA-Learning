class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
                    if(res < count){
                res=count;
                    }
            }
        
        
            else{
                count =0;
            }
        }
        return res;
    }
}