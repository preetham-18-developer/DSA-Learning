class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0)+1);
        }

        for(int key:hm.keySet()){
            int num = hm.get(key);
            if(num == 1) return key;
        }
        return ans;
    }
}