package leetcode;

public class No24 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode node = head, pre = null;
        boolean flag = true;

        while (node != null) {
            if (node.next == null) {
                if (pre != null)
                    pre.next = node;
                break;
            }
            if (flag) {
                ListNode temp = node.next;
                node.next = node.next.next;
                temp.next = node;
                node = temp;
                flag = false;
                if (pre != null)
                    pre.next = node;
                else
                    head = temp;

                pre = temp;
            } else {
                pre = node;

                flag = true;
            }
            node = node.next;


        }

        return head;
    }

//    private void swap(ListNode node) {
//        if (node == null || node.next == null) {
//        } else if (node.next.next == null) {
//            node.next.next = node;
//            node.next = null;
//        } else if (node.next.next.next == null) {
//            ListNode temp = node.next;
//            node.next = node.next.next;
//            temp.next = node;
//        } else {
//            ListNode temp = node.next;
//            node.next = node.next.next.next;
//            temp.next = node;
//        }
//
//
//    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode head = new No24().swapPairs(n1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
