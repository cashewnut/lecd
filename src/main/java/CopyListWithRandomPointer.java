public class CopyListWithRandomPointer {

    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return null;
        RandomListNode cur = head;
        while (cur != null) {
            RandomListNode cp = new RandomListNode(cur.label);
            RandomListNode temp = cur.next;
            cur.next = cp;
            cp.next = temp;
            cur = temp;
        }

        cur = head;
        while (cur != null) {
            cur.next.random = cur.random.next;
            cur = cur.next.next;
        }

        RandomListNode res = head.next;
        cur = head;
        RandomListNode cpcur = res;
        while(cur != null && cpcur != null){
            RandomListNode temp = cpcur.next;
            cur.next = temp;
            if(temp != null) {
                cpcur.next = temp.next;
                cur = temp;
                cpcur = cpcur.next;
            }
        }

        return res;
    }

}
