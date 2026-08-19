class Solution {
    public int findDuplicate(int[] nums) {

        HashMap <Integer,Integer> hm = new HashMap<>();

        int ans = 0;

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i] ,0) + 1);
        }

        for(int num : hm.keySet()){
            int n = hm.get(num);

            if(n > 1) return num;
        }
        return -1;
    }
}