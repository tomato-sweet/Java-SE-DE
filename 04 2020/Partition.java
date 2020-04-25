/*
编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
 */


//设置两个链表头，遍历原链表，一个追加小数链表，一个追加大数链表，最后将小数链表粘到大数链表前边即为结果。
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode cur = pHead;
        ListNode Shead = new ListNode(-1);
        ListNode Bhead = new ListNode(-1);
        ListNode Stmp = Shead;
        ListNode Btmp = Bhead;
        while(cur != null){
            if(cur.val < x){
                Stmp.next = new ListNode(cur.val);
                Stmp = Stmp.next;
            }else{
                Btmp.next = new ListNode(cur.val);
                Btmp = Btmp.next;
            }
            cur = cur.next;
        }cur = Shead;
        while(cur.next != null && cur.next.val != -1){
            cur = cur.next;
        }
        cur.next = Bhead.next;
        return Shead.next;
    }
}
