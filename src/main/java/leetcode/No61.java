package leetcode;

public class No61 {

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null)
			return null;
		int length = 1;
		ListNode node = head;
		while (node.next != null) {
			length++;
			node = node.next;
		}
		node.next = head;
		k = length - k % length;
		node = head;
		while(k-->0) 
			node = node.next;
		ListNode temp = node;
		while(length-->1) {
			node = node.next;
		}
		node.next = null;
		return temp;
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n4.next = n5;
		n3.next = n4;
		n2.next = n3;
		n1.next = n2;
		new No61().rotateRight(n1, 2);
		
	}

}
