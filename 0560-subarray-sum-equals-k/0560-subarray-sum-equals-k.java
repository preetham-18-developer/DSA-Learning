class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int total=0;
        int left =0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            total += nums[i];
            if(hm.containsKey(total -k)) {
                count += hm.get(total -k);
            }
            hm.put(total, hm.getOrDefault(total,0 ) +1);
        }
       
        return count;
    }
}