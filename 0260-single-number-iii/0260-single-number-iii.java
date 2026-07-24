class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        for(int i =0;i<nums.length;i++){
            xor ^= nums[i];
        }
        int mask =  xor & (-xor);

        int num1 =0;
        int num2=0;

        for(int i =0;i<nums.length;i++){

            if((mask & nums[i]) != 0){
                num1 ^= nums[i];
            }
            else{
                num2 ^= nums[i];
            }
        }
        return new int[]{num1,num2};
    }
}