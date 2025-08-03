package org.DataStructure;

public class LinkedStack {
    Node top;

    LinkedStack(){
        top = null;
    }

    public void push(int val){
        Node temp = top;
        Node obj = new Node();
        obj.data = val;
        obj.next = top;
        System.out.println("Inserted value : "+val);
        top = obj;
    }

    public void pop(){
        if(top.next == null){
            System.out.println("Stack already empty");
        }
        else{
            System.out.println("Item removed :" + top.data);
            top = top.next;
        }
    }

    public void show(){
        Node temp =top;
        //System.out.println("Length " + lenlist(Head));
        while(temp.next != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}
