import leetcode.ListNode;

public class SortList {

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;
        ListNode mid = getMiddle(head);
        ListNode right = mid.next;
        mid.next = null;
        head = sortList(head);
        right = sortList(right);
        return merge(head, right);
    }

    public ListNode getMiddle(ListNode head) {
        if (head.next == null || head.next.next == null)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummyHead = new ListNode(0), cur = dummyHead;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                cur.next = left;
                left = left.next;
            } else {
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }
        if(left == null)
            cur.next = right;
        else
            cur.next = left;
        return dummyHead.next;
    }

}
