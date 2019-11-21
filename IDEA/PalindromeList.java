
public class PalindromeList {
    int val;
    ListNode next;
    //求代码长度
    public  ListNode getLength(ListNode head) {
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    //求中间节点
    public ListNode getMidddle(ListNode head){
        int length = getLength(head);
        int half = length/2;
        ListNode cur = head;
        for (int i = 0; i < half; i++) {
            cur = cur.next;
        }
        return cur;
    }

    //逆置列表
    public ListNode reverseList(ListNode head){
        ListNode nhead = null;  // 新建一个链表，nHead 是头结点
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            // 把 cur 头插到 nHead 所代表的链表上去
            cur.next = nhead;
            nhead = cur;
            cur = next;
        }
        return nhead;
    }

    public boolean chkPalindrome(ListNode A){
        ListNode middle = getMiddle(A);
        ListNode rHead = reverseList(middle);
        ListNode c1 = A;
        ListNode c2 = rHead;

        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                return false;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        return true;
    }
}
