package org.main;

//;TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//class TNode<T> {
//    T data;
//    Node<T> next;
//
//    public TNode(T data) {
//        this.data = data;
//    }
//}

//public class Solution {
//    public static TNode<Integer> evenAfterOdd(TNode<Integer> head) {
//        //Your code goes here
//        Node<Integer> odd = head;
//        Node<Integer> even = head;
//        Node<Integer> curr = head;
//        Node<Integer> temp = new Node<Integer>
//        if(head==null){
//            return head;
//        }
//        while(curr != null){
//            if((curr.data)%2 ==0){
//                even = curr;
//            }
//        }
//        return head ;
//    }
//}

import org.DataStructure.Data_Structure_Manager;

public class Main {
    public static void main(String[] args) {
        Data_Structure_Manager lLinked_obj = new Data_Structure_Manager();
        System.out.println("-----------------Normal Linked List Working-----------------");
//        lLinked_obj.linkedListWrking();
        System.out.println("-----------------Normal Doubly Linked List Working-----------------");
//        lLinked_obj.doublyLinkedListwrking();
        System.out.println("-----------------Stack Implementation through Linked List-----------------");
//        lLinked_obj.LinkedStackWrking();
        System.out.println("-----------------Stack Implementation through Array-----------------");
//        lLinked_obj.arrayStackWrking();
        System.out.println("-----------------Queue Implementation through Linked List-----------------");
//        lLinked_obj.arrayQueueWrking();
        System.out.println("-----------------Queue Implementation through doubly Linked List-----------------");
//        lLinked_obj.doublyLinkedListQueuewrking();
        System.out.println("-----------------Binary Search Tree Implementation-----------------");
//        lLinked_obj.BSTreeImpl();
    }
}