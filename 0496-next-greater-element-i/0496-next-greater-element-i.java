class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = (int)1e4;
        int[] nextGreater = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            nextGreater[i] = -1;
        }

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            if(!stack.isEmpty()){
            nextGreater[nums2[i]] = stack.peek();
            }
            stack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreater[nums1[i]];
        }

        return nums1;
    }
}