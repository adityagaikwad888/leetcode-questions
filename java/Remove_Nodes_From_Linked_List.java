import java.util.*;

public class Remove_Nodes_From_Linked_List {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode prv = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prv;
            prv = cur;
            cur = temp;
        }

        return prv;
    }

    public ListNode removeNodes(ListNode h) {
        if (h == null || h.next == null)
            return h;

        ListNode head = reverse(h);
        ListNode cur = head;
        ListNode prv = null;

        int n = cur.val;
        while (cur != null) {
            if (cur.val < n) {
                prv.next = cur.next;
                cur = cur.next;
            } else {
                n = Math.max(n, cur.val);
                prv = cur;
                cur = cur.next;
            }
        }
        return reverse(head);
    }
}
