public class MyLinkedList {
	public static Node buildLinkedListHand() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		// 1 2 3 4 5
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		
		return n1;
	}
	
	// O(n)
	public static Node pushBack(Node head, int val) {
		Node node = new Node(val);
		if (head == null) {
			// 链表中没有结点
			return node;
		} else {
			// 链表中至少有一个结点
			Node cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			// cur.next 一定是 null，即 cur 就是当前链表的最后一个结点
			cur.next = node;
			
			return head;
		}
	}
	
	// O(n)
	public static Node popBack(Node head) {
		if (head == null) {
			throw new RuntimeException("空的");
		}
		
		if (head.next == null) {
			return null;
		} else {
			Node cur = head;
			while (cur.next.next != null) {
				cur = cur.next;
			}
			cur.next = null;
			
			return head;
		}
	}
	
	public static void printPartList(Node head) {
		// 1 2 3 4 5 6 7
		Node cur;
		
		// 3 4 5 6 7
		// 找到第三个结点，往后跳 2 步
		cur = head;
		for (int i = 0; i < 2; i++) {
			cur = cur.next;
		}
		for (Node n = cur; n != null; n = n.next) {
			System.out.println(n.val);
		}
		
		
		// 3 4 5
		// 找到第三个结点，往后跳 2 步
		// 到倒数第三个结点
		cur = head;
		for (int i = 0; i < 2; i++) {
			cur = cur.next;
		}
		for (Node n = cur; n.next.next != null; n = n.next) {
			System.out.println(n.val);
		}
	}
	
	public static void printLinkedList(Node head) {
		Node cur = head;
		
		while (cur != null) {
			System.out.println(cur.val);
			cur = cur.next;
		}
	}
	
	// O(1)
	public static Node pushFront(Node head, int val) {
		Node node = new Node(val);
		node.next = head;
		return node;
	}
	// O(1)
	public static Node popFront(Node head) {
		if (head == null) {
			throw new RuntimeException("空链表");
		}
		
		return head.next;
	}
	
	public static void main(String[] args) {
		/*
		Node head = buildLinkedListHand();
		// 按序打印每一个值
		// 1 2 3 4 5
		// 如何遍历链表
		printLinkedList(head);
		*/
		
		/*
		Node head = null;
		
		head = pushFront(head, 0);
		head = pushFront(head, 1);
		head = pushFront(head, 2);
		head = pushFront(head, 3);
		head = pushFront(head, 4);
		
		printLinkedList(head);
		
		head = popFront(head);
		head = popFront(head);
		
		printLinkedList(head);
		*/
		
		/*
		Node head = buildLinkedListHand();
		printPartList(head);
		*/
		
		Node head = null;
		head = pushBack(head, 1);
		head = pushBack(head, 2);
		head = pushBack(head, 3);
		head = pushBack(head, 4);
		head = pushBack(head, 5);
		printLinkedList(head);
		head = popBack(head);
		head = popBack(head);
		head = popBack(head);
		head = popBack(head);
		printLinkedList(head);
		head = popBack(head);
		printLinkedList(head);
	}
}




