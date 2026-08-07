class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }

        for(int num : hm.keySet()){

            if(hm.get(num) == 2){
                hs.add(num);
            }
        }

        for(int num : hs){
            arr.add(num);
        }
        return arr;
    }
}