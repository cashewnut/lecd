import leetcode.ListNode;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode cur = head, next = head.next;
        ListNode dummyHead = new ListNode(0);
        while (cur != null) {
            ListNode cpcur = dummyHead.next, pre = dummyHead;

            while (cpcur != null && cur.val > cpcur.val) {
                pre = cpcur;
                cpcur = cpcur.next;
            }
            pre.next = cur;
            cur.next = cpcur;

            cur = next;
            if (cur != null)
                next = cur.next;
        }
        return dummyHead.next;
    }
}
