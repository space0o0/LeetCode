package circleLinked;

import leetcode707.ListNode;

public class Solution {

    public boolean hasCircle(ListNode head) {

        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

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

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (slow.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (fast == null || fast.next == null) return null;

            if (fast == slow) {
                System.out.println("has cycle");
                break;
            }
        }

        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }

    //相交linked
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        if (a == null || b == null) {
            return null;
        }

        int sizeA = 0, sizeB = 0;

        //has common node

        while (a.next != null) {
            a = a.next;
            sizeA++;
        }

        while (b.next != null) {
            b = b.next;
            sizeB++;
        }

        if (a == b) {
            System.out.println("has common node~");
        } else {
            System.out.println("has no common node!!");
            return null;
        }

        ListNode l1;//long listnode
        ListNode l2;//short listnode
        int diff = 0;

        if (sizeA >= sizeB) {
            diff = sizeA - sizeB;
            l1 = headA;
            l2 = headB;
        } else {
            diff = sizeB - sizeA;
            l1 = headB;
            l2 = headA;
        }

        int pos = 0;
        while (pos != diff) {
            l1 = l1.next;
            pos++;
        }

        while (l1 != l2) {
            l1 = l1.next;
            l2 = l2.next;
        }

        return l1;
    }

    //删除链表的倒数第N个节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){return null;}

        //2个指针，fast走n-1格后，slow开始走，fast停了，slow那个删除
        ListNode fast=head;
        ListNode slow=head;

        int pos=0;
        int len=1;

        boolean slowStart=false;

        while(fast.next!=null){

            fast=fast.next;
            pos=pos+1;
            len=len+1;

            if(pos-1==n){
                slowStart=true;
            }

            if (slowStart){
                slow=slow.next;
            }
        }

        //delete slow.next;

        if(len==n){
            //delete first
            slow=head.next;
            head=slow;
            return head;
        }

        if(n==1){
            //delete last
            slow.next=null;
            return head;
        }

        slow.next=slow.next.next;

        return head;
    }

    public ListNode reverseList(ListNode head) {

        if(head==null) return null;

        ListNode list=head;
        ListNode newHead=null;

        while(list!=null){
            ListNode next=list.next;

            list.next=newHead;
            newHead=list;

            list=next;
        }

        return newHead;
    }

    public ListNode removeElements(ListNode head, int val) {

        if(head==null){return null;}

        ListNode list=head;

        while(list.next!=null){

            if(list.next.val==val){
                list.next=list.next.next;
            }else{
                list=list.next;
            }
        }

        if(head.val==val){
            head=head.next;
        }

        return head;

    }

    public ListNode oddEvenList(ListNode head) {

        if(head==null){return null;}

        ListNode oddList=head;//奇数
        ListNode evenList=head.next;//偶数

        ListNode temp=evenList;

        while(evenList!=null&&evenList.next!=null){
            oddList.next=evenList.next;
            oddList=oddList.next;
            evenList.next=oddList.next;
            evenList=evenList.next;
        }

        oddList.next=temp;

        return head;
    }
}
