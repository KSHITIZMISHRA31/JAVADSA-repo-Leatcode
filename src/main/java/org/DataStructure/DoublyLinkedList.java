package org.DataStructure;

public class DoublyLinkedList {

    Node head;
    Node tail;

    DoublyLinkedList(){
        head = null;
        tail = null;
    }

    private boolean isempy(){
        return (head == null && tail == null);
    }

    private boolean itemexist(int val){
        Node temp = head;
        boolean flag = false;
        while(temp.next!=null){
            if(temp.data == val){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(temp.data == val){
            flag = true;
        }
        return flag;
    }

    public void insert(int val){
        Node obj = new Node();
        System.out.println("Item inserted is : "+val);
        obj.data = val;
        obj.next = null;
        obj.prvs = null;
        head = obj;
        tail = obj;
    }

    public void insertBegning(int val){
        Node obj = new Node();
        obj.data = val;
        obj.prvs = null;
        if(isempy()){
            insert(val);
        }
        else {
            System.out.println("Item inserted is Begning : "+val);
            obj.next = head;
            head.prvs = obj;
            head = obj;

        }
    }

    public void insertEnd(int val){
        Node obj = new Node();
        obj.data = val;
        obj.next = null;
        if(isempy()){
            insert(val);
        }
        else {
            System.out.println("Item inserted is End : "+val);
            obj.prvs = tail;
            tail.next = obj;
            tail = obj;
        }
    }

    public void insertBeforeval(int val, int valBefore){
        Node temp = head;
        Node obj = new Node();
        if(itemexist(val)){
            System.out.println("Item not present");
        }
        else{
            System.out.println("Inserted value: "+ val +" before " + valBefore);
            obj.data = val;
            while (temp.next != null){
                if(temp.data == valBefore){
                    break;
                }
                temp = temp.next;
            }
            obj.next=temp;
            obj.prvs=temp.prvs;
            if(temp.prvs!=null){
                temp.prvs.next = obj;
            }
            else{
                head = obj;
            }
            temp.prvs = obj;
        }
    }

    public void insertAfterval(int val, int valAfter){
        Node temp = head;
        Node obj = new Node();
        if(itemexist(val)){
            System.out.println("Item not present");
        }
        else{
            System.out.println("Inserted value: "+ val +" after " + valAfter);
            obj.data = val;
            while (temp.next != null){
                if(temp.data == valAfter){
                    break;
                }
                temp = temp.next;
            }
            obj.prvs = temp;
            obj.next = temp.next;
            if(temp.next!=null){
                temp.next.prvs = obj;
            }
            else{
                tail = obj;
            }
            temp.next = obj;

        }
    }

    public void deleteBegning(){
        if(isempy()){
            System.out.println("Linked List is Empty");
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            System.out.println("Deleted Item : " + head.data);
            head = head.next;
            head.prvs = null;
        }
    }

    public void deleteEnd(){
        if(isempy()){
            System.out.println("Linked List is Empty");
            return;
        }
        else if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            System.out.println("Deleted Item : " + tail.data);
            tail = tail.prvs;
            tail.next = null;
        }

    }

    public void deleteItem(int val){
        if(isempy()){
            System.out.println("Linked List is empty");
            return;
        }
        if(!itemexist(val)){
            System.out.println("Item "+val+" not in List");
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            if(temp.data == val){
                break;
            }
            temp=temp.next;
        }
        System.out.println("Deleted item : "+val);
        if(temp.data==val){
            if(temp.next == null && temp.prvs == null){
                head=null;
                tail=null;
            }
            else if (temp.next == null) {
                tail = temp.prvs;
                tail.next = null;
            }
            else if(temp.prvs == null){
                head = temp.next;
                head.prvs = null;
            }
            else{
                temp.prvs.next = temp.next;
                temp.next.prvs = temp.prvs;
            }
        }


    }

    public void showfront(){
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

    public void showback(){
        if(isempy()){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = tail;
        while(temp.prvs != null){
            System.out.print(temp.data +" <-> ");
            temp = temp.prvs;
        }
        System.out.print(temp.data);
        System.out.println();
    }

}
