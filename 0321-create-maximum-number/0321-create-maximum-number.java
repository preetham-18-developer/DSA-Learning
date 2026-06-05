class Solution {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {

        int[] answer = new int[k];

        int start = Math.max(0, k - nums2.length);
        int end = Math.min(k, nums1.length);

        for (int i = start; i <= end; i++) {

            int[] part1 = maxSubsequence(nums1, i);
            int[] part2 = maxSubsequence(nums2, k - i);

            int[] candidate = merge(part1, part2);

            if (greater(candidate, 0, answer, 0)) {
                answer = candidate;
            }
        }

        return answer;
    }

    private int[] maxSubsequence(int[] nums, int k) {

        int[] stack = new int[k];

        int top = -1;

        int remove = nums.length - k;

        for (int num : nums) {

            while (top >= 0 &&
                   stack[top] < num &&
                   remove > 0) {

                top--;
                remove--;
            }

            if (top + 1 < k) {
                stack[++top] = num;
            } else {
                remove--;
            }
        }

        return stack;
    }

    private int[] merge(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < a.length || j < b.length) {

            if (greater(a, i, b, j)) {
                result[idx++] = a[i++];
            } else {
                result[idx++] = b[j++];
            }
        }

        return result;
    }

    private boolean greater(int[] a, int i,
                            int[] b, int j) {

        while (i < a.length &&
               j < b.length &&
               a[i] == b[j]) {

            i++;
            j++;
        }

        if (j == b.length) return true;

        if (i == a.length) return false;

        return a[i] > b[j];
    }
}
