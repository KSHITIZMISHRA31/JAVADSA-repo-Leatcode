package org.DataStructure;

public class DoublyLinkedListQueue {

    Node head;
    Node tail;

    DoublyLinkedListQueue(){
        head = null;
        tail = null;
    }

    private boolean isempy(){
        return (head == null && tail == null);
    }

    public void insertfirst(int val){
        Node obj = new Node();
        System.out.println("Item inserted is : "+val);
        obj.data = val;
        obj.next = null;
        obj.prvs = null;
        head = obj;
        tail = obj;
    }

    public void insert (int val){
        Node obj = new Node();
        obj.data = val;
        obj.next = null;
        if(isempy()){
            insertfirst(val);
        }
        else {
            System.out.println("Item inserted : "+val);
            obj.prvs = tail;
            tail.next = obj;
            tail = obj;
        }
    }

    public void delete(){
        if(isempy()){
            System.out.println("Queue is Empty");
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            System.out.println("Removed Item : " + head.data);
            head = head.next;
            head.prvs = null;
        }
    }

    public void show(){
        if(isempy()){
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data +" <-> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }

}
