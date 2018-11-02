package leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
class AddTwoNumbers {

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }

        ListNode h1 = l1;
        ListNode lp1;
        ListNode h2 = l2;
        ListNode lp2;
        int extra = 0;

        do {
            int d = l1.val + l2.val + extra;
            if (d > 9) {
                extra = 1;
                d -= 10;
            } else {
                extra = 0;
            }
            l1.val = d;
            lp1 = l1;
            l1 = l1.next;
            l2.val = d;
            lp2 = l2;
            l2 = l2.next;
        } while (l1 != null && l2 != null);

        ListNode h;
        ListNode l;
        ListNode lp;

        if (l1 != null) {
            h = h1;
            l = l1;
            lp = lp1;
        } else {
            h = h2;
            l = l2;
            lp = lp2;
        }

        while (extra > 0 && l != null) {
            int d = l.val + extra;
            if (d > 9) {
                extra = 1;
                d -= 10;
            } else {
                extra = 0;
            }
            l.val = d;
            lp = l;
            l = l.next;
        }
        if (extra > 0) {
            lp.next = new ListNode(extra);
        }

        return h;
    }
}
