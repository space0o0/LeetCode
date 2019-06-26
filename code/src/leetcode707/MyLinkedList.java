package leetcode707;

public class MyLinkedList {

    private ListNode head = null;

    public MyLinkedList() {
    }

    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head;
        head = newHead;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode tempHead = head;

        while (tempHead.next != null) {
            tempHead = tempHead.next;
        }

        tempHead.next = newNode;
    }

    public void addAtIndex(int index, int val) {

        int position = 0;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        ListNode tempNode = head;
        ListNode newNode = new ListNode(val);
        while (tempNode.next != null) {

            if (index - 1 == position) {
                newNode.next = tempNode.next;
                tempNode.next = newNode;
                return;
            }

            tempNode = tempNode.next;
            position = position + 1;

        }
    }

    public int get(int index) {

        ListNode tempNode = head;
        int position = 0;

        if (tempNode == null) {
            return -1;
        }

        while (tempNode.next != null) {

            if (index - 1 == position) {
                System.out.println("the value of index is : " + tempNode.next.val);
                return tempNode.next.val;
            }

            tempNode = tempNode.next;
            position = position + 1;
        }

        return -1;
    }

    public void deleteAtIndex(int index) {

        ListNode tempNode = head;
        int position = 0;

        if (index == 0) {
            head = head.next;
            return;
        }

        while (tempNode.next != null) {

            if (index - 1 == position) {
                tempNode.next = tempNode.next.next;
                return;
            }

            tempNode = tempNode.next;
            position = position + 1;
        }

    }

    public void showALl() {
        ListNode tempHead = head;

        while (tempHead != null) {
            System.out.println(tempHead.val);
            tempHead = tempHead.next;
        }

    }
}
