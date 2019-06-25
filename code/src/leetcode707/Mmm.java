package leetcode707;

public class Mmm {

    public static void main(String[] arts) {

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);

//        linkedList.get(2);
        linkedList.deleteAtIndex(2);
        linkedList.showALl();
    }
}
