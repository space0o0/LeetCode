package leetcode002;

import leetcode707.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int flag=0;
        ListNode newNode=new ListNode(0);
        ListNode listNode=newNode;

        int add=0;
        int v1=0,v2=0;

        while(l1!=null||l2!=null){

            v1= l1==null? 0 : l1.val;
            v2= l2==null? 0 : l2.val;

            add=v1+v2+flag;

            flag=add/10;
            add=add%10;

            newNode.next=new ListNode(add);
            newNode=newNode.next;

            if(l1!=null){
                l1=l1.next;
            }

            if(l2!=null){
                l2=l2.next;
            }
        }

        if(flag>0){
            newNode.next=new ListNode(flag);
            newNode=newNode.next;
        }

        return listNode.next;
    }
}
