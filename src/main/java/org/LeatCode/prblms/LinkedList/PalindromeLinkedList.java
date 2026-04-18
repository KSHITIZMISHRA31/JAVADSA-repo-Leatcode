package org.LeatCode.prblms.LinkedList;

import java.util.Stack;

import static org.LeatCode.prblms.LinkedList.ListNode.buildList;
import static org.LeatCode.prblms.LinkedList.ListNode.printList;

public class PalindromeLinkedList {

    /// ==========================
    /// Better approach
    /// space and time complexity O(n)
    /// ==========================
    public static boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        Stack<Integer> revcheck = new Stack<>();
        printList(head);
        while (fast != null && fast.next != null){
            revcheck.push(slow.val);
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null){
            if(revcheck.peek() != slow.val){
                return false;
            }
            revcheck.pop();
            slow = slow.next;
        }
        return true;
    }

    /// ===========================
    /// for Optimized approach we can reverse the half linked list
    /// ===========================

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        ListNode head = buildList(arr);
        //printList(head);
        System.out.println(isPalindrome(head));
    }
}
