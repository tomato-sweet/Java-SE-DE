import java.util.List;

/**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class AddNumber {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            LisrNode dummyHead = new LisrNode(0);
            ListNode p = 11,q= 12,curr = dummyHead;
            int carry = 0;
            while (p != null || q!= null) {
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (p != null) p = p.next;
                if (q != null) q = q.next;
            }
            if (carry > 0){
                curr.next = new ListNode(carry);
            }
            return  dummyHead.next;
        }
}
