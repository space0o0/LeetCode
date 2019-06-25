package leetcode707;

public class MyLinkedList {

    private LinkedNode head = null;

    public MyLinkedList() {
    }

    public void addAtHead(int val) {
        LinkedNode newHead = new LinkedNode(val);
        newHead.next = head;
        head = newHead;
    }

    public void addAtTail(int val) {
        LinkedNode newNode = new LinkedNode(val);
        LinkedNode tempHead = head;

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

        LinkedNode tempNode = head;
        LinkedNode newNode = new LinkedNode(val);
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

    public void get(int index) {

        LinkedNode tempNode = head;
        int position = 0;
        while (tempNode.next != null) {

            if (index == position) {
                System.out.println("the value of index is : " + tempNode.val);
                return;
            }

            tempNode = tempNode.next;
            position = position + 1;
        }
    }

    public void deleteAtIndex(int index) {

        LinkedNode tempNode = head;
        int position = 0;

        if (index == 0) {
            head = head.next;
            return;
        }

        while (tempNode.next != null) {

            if (index-1 == position) {
                tempNode.next = tempNode.next.next;
                return;
            }

            tempNode = tempNode.next;
            position = position + 1;
        }

    }

    public void showALl() {
        LinkedNode tempHead = head;

        while (tempHead != null) {
            System.out.println(tempHead.val);
            tempHead = tempHead.next;
        }

    }
}
