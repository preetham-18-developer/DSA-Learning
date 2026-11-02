
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        ListNode cur1 = l1;
        ListNode cur2 = l2;

        while (cur1 != null) {
            arr1.add(cur1.val);
            cur1 = cur1.next;
        }

        while (cur2 != null) {
            arr2.add(cur2.val);
            cur2 = cur2.next;
        }

        int p = arr1.size() - 1;
        int y = arr2.size() - 1;

        ArrayList<Integer> ans = new ArrayList<>();

        int carry = 0;

        while (p >= 0 || y >= 0 || carry > 0) {

            int sum = carry;

            if (p >= 0) {
                sum += arr1.get(p);
                p--;
            }

            if (y >= 0) {
                sum += arr2.get(y);
                y--;
            }

            carry = sum / 10;
            ans.add(sum % 10);
        }

        Collections.reverse(ans);

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        for (int i = 0; i < ans.size(); i++) {

            ListNode node = new ListNode(ans.get(i));

            cur.next = node;
            cur = cur.next;
        }

        return dummy.next;
    }
}
