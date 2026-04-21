package org.LeatCode.prblms.LinkedList;

import static org.LeatCode.prblms.LinkedList.ListNode.buildList;
import static org.LeatCode.prblms.LinkedList.ListNode.printList;

public class RotateList {

    public static ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode tail = head;
        int len = 1;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }
        tail.next = head;
        k = k % len;

        int stepsToNewTail = len - k;
        ListNode newTail = head;

        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        ListNode head = buildList(arr);
        //printList(head);
        printList(rotateRight(head,k));
    }
}
