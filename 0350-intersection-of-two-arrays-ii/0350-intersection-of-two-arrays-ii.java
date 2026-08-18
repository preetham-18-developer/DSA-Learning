class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int p1 =0;
    int p2=0;
    int n = nums1.length;
    int m = nums2.length;
    ArrayList <Integer> ans = new ArrayList<>();
    while(p1 < n && p2  < m){

            if(nums1[p1] == nums2[p2]){
                ans.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1] < nums2[p2]){
                p1++;
            }
            else{
                p2++;
            }
    }
    int arr[] = new int[ans.size()];

    for(int i=0;i<ans.size();i++){
        arr[i] = ans.get(i);
    }
    return arr;
    }
}