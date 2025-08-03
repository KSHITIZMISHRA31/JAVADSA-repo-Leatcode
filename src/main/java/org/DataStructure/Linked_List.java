package org.DataStructure;

class Linked_List {
    Node Head;
    //constructor
    Linked_List(){
        Head = null;
    }

    //function to insert element in the last
    public void insert(int val){
        Node obj = new Node();
        obj.data = val;
        obj.next = null;
        Node temp =Head;
        if(temp == null) {
            Head = obj;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = obj;
        }
        System.out.println("Item Inserted : "+obj.data);
    }

    // function to insert element at perticular location
    public void insertatloc(int val,int index){

        int listlen = lenlist(Head);
        Node temp = Head;
        Node obj = new Node();
        obj.data = val;
        if(index > listlen){
            System.out.println("Length is less inserting in last");
            this.insert(val);
        }
        else if(index == 1){
            obj.next = Head;
            Head = obj;
        }
        else{
            for(int i=1;i<index;i++){
                temp = temp.next;
            }
            obj.next = temp.next;
            temp.next = obj;
        }
    }

    public void remove(){
        Node temp = this.Head;
        if(temp == null){
            System.out.println("List is Empty");
            return;
        }
        else if(temp.next == null){
            System.out.println("Removed item :"+ temp.data);
            Head = null;
        }
        else{
            while(temp.next.next != null){
                temp = temp.next;
            }

            System.out.println("Removed item :"+temp.next.data);
            temp.next = null;

        }
    }

    public void deleteloc(int index){
        Node temp = Head;
        int len = lenlist(Head);
        if(len == 0){
            System.out.println("Linked List is already Empty");
            return;
        }
        if(len>0){
            if(index == len || index>len) {
                remove();
            }
            else if(index == 1){
                System.out.println("Removed item : "+Head.data+" from loc : "+ index);
                Head = Head.next;
            }
            else{
                for(int i = 1;i<index-1;i++){
                    temp = temp.next;
                }
                System.out.println("Removed item : "+temp.next.data+" from loc : "+ index);
                temp.next = temp.next.next;
            }
        }
    }

    private int lenlist(Node temp){
        int val = 0;
        if(temp == null) {
            return val;
        }
        if(temp.next == null){
            return ++val;
        }
        while (temp.next != null) {
            ++val;
            temp = temp.next;
        }
        return ++val;
    }

    public void show(){
        Node temp =Head;
        //System.out.println("Length " + lenlist(Head));
        if((lenlist(Head)>0)){
            while(temp.next != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

}
