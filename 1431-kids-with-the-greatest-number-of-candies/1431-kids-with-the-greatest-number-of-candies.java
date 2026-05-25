class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList <Boolean> al = new ArrayList<>();         
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max , candies[i]);
        }
        for(int i=0;i<n;i++){
            int temp = extraCandies + candies[i];
            if(temp >= max) {
                al.add(true);
            }
            else{
                al.add(false);
            }
        }
        return al;
    }
}