class Solution {
    public int search(int[] nums, int target) {
        
        return binary(nums , target, nums.length - 1 , 0);
    }

    private int binary(int[] nums,int target , int end , int start){
        if(start > end) return -1;
        int mid = (start + end) / 2;
        if(target == nums[mid]) return mid;
        else if(target < nums[mid]) {
        return binary(nums , target , mid - 1, start );
        }

        else{
            return binary(nums, target , end , mid +1);
        }
        
    }
}