public class ListNode {
    int val;
    ListNode next;
    ListNode random;

    public static class Node<T>{
        private T val;
        private Node next;
        private Node random;
        public Node(){
            next = null;
            random = null;
        }
        public Node(T val){
            this.val = val;
            next = null;
            random = null;
        }
    }
    public ListNode copy(ListNode head){
        if(head == null){
            return null;
        }
        Node p = head;
        while (p != null){
            Node q =new Node(p.val);
            q.next = p.next;
            q.random = null;

        }
    }
}
