package org.LeatCode.prblms.LinkedList;

import java.util.Stack;

import static org.LeatCode.prblms.LinkedList.ListNode.buildList;
import static org.LeatCode.prblms.LinkedList.ListNode.printList;

public class MaximumTwinSumofaLinkedList {

    public static int pairSum(ListNode head) {

        //printList(head);
        int len = 0;
        ListNode temp = head;
        while (temp!=null){
            temp = temp.next;
            len++;
        }
        System.out.println(len);
        Stack<Integer> pairsum = new Stack<>();
        for(int i=0;i<len/2;i++){
            pairsum.push(head.val);
            head = head.next;
        }
        System.out.println(pairsum+" : "+head.val);
        int maxsum = Integer.MIN_VALUE;
        while(head!=null){
            maxsum = Math.max(maxsum,pairsum.peek()+ head.val);
            pairsum.pop();
            head = head.next;
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] head ={5,4,2,1};
        ListNode ls = buildList(head);
        System.out.println(pairSum(ls));
    }
}
