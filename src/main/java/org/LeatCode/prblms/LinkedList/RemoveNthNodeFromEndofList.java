package org.LeatCode.prblms.LinkedList;

import static org.LeatCode.prblms.LinkedList.ListNode.buildList;
import static org.LeatCode.prblms.LinkedList.ListNode.printList;

public class RemoveNthNodeFromEndofList {

    /// ====================
    /// Better Approach
    /// need to traverse linked list twice first to find length and then went to n-1 to remove element
    /// ====================
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        len = len - n-1;
        if(len == -1){
            return head = head.next;
        }
        temp = head;
        while(len>0){
            len--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }

    /// ====================
    /// Optimized Approach
    /// we will first move N steps fast pointeer and then move both slow and
    /// fast togeterg when fast reach end then slow pointer pointing node must be removed
    /// ====================


    public static ListNode optimizedRemoveNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove node
        slow.next = slow.next.next;

        return dummy.next;
    }


    public static void main(String[] args) {
        int[] arr = {12,3,4,5,6,7,8};
        int n = 3;
        ListNode head = buildList(arr);
        printList(head);
        printList(removeNthFromEnd(head,n));

        System.out.println("Optimized Approach");

        ListNode head1 = buildList(arr);
        printList(head1);
        printList(optimizedRemoveNthFromEnd(head1,n));

    }
}
