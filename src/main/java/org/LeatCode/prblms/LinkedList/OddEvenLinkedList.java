package org.LeatCode.prblms.LinkedList;

import static org.LeatCode.prblms.LinkedList.ListNode.buildList;
import static org.LeatCode.prblms.LinkedList.ListNode.printList;

public class OddEvenLinkedList {

    /// ========================
    /// Better Approach
    /// we can make 2 even/odd linked list to store values but
    /// that will take time = O(n) with space = O(n)
    /// we need to do it in O(1) space complexity
    /// ========================

    public static ListNode oddEvenList(ListNode head) {

        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,5,6,4,7};

        ListNode head = buildList(arr);
        printList(head);
        printList(oddEvenList(head));

    }
}
