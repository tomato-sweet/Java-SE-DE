public class ReverseList {
	public Node reverseList(Node head) {
		Node nHead = null;
		
		Node cur = head;
		while (cur != null) {
			Node next = cur.next;
			
			cur.next = nHead;
			nHead = cur;
			
			cur = next;
		}
		
		return nHead;
	}
	
	public Node reverseList2(Node head) {
		if (head == null) {
			return null;
		}
		
		Node p1 = null;
		Node p2 = head;
		Node p3 = head.next;
		
		while (p2 != null) {
			p2.next = p1;
			
			p1 = p2;
			p2 = p3;
			if (p3 != null) {
				p3 = p3.next;
			}
		}
		
		return p1;
	}
}