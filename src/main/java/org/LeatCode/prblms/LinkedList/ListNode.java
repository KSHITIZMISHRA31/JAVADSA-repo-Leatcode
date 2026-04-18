package org.LeatCode.prblms.LinkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
