package org.LeatCode.prblms.LinkedList;

import static org.LeatCode.prblms.LinkedList.ListNode.buildList;
import static org.LeatCode.prblms.LinkedList.ListNode.printList;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head){

        printList(head);
        if(head == null || head.next == null){
            return head;
        }
        ListNode revhead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return revhead;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ListNode head = buildList(arr);
//        printList(head);
        printList(reverseList(head));
    }

}
