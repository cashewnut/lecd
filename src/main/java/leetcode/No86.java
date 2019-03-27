package leetcode;

public class No86 {

    public ListNode partition(ListNode head, int x) {

        if (head == null)
            return null;

        ListNode p1 = new ListNode(0), p2 = new ListNode(0), dummy = p1;

        ListNode cur = head;
        while (cur != null) {
            if (cur.val < x) {
                p1.next = cur;
                p1 = p1.next;
            } else {
                p2.next = cur;
                p2 = p2.next;
            }
            cur = cur.next;
        }
        p1.next = p2.next;
        return dummy.next;

    }

    public static void main(String[] args) {
        /*ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(2);
        l5.next = l6;
        l4.next = l5;
        l3.next = l4;
        l2.next = l3;
        l1.next = l2;*/
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        new No86().partition(l1, 3);
    }

}
