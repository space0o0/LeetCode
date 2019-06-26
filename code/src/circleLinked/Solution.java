package circleLinked;

import leetcode707.LinkedNode;

public class Solution {

    public boolean hasCircle(LinkedNode head) {

        if (head == null || head.next == null) return false;

        LinkedNode slow = head;
        LinkedNode fast = head;

        while (slow.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (fast == null || fast.next == null) return false;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public LinkedNode detectCycle(LinkedNode head) {

    }
}
