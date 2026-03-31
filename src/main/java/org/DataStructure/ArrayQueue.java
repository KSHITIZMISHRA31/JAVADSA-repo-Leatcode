package org.DataStructure;

public class ArrayQueue {
    int capacity = 5;
    int[] arr = new int[capacity];
    int Head = 0;
    int tail = 0;

    public void insert(int val){
        if(isfull()){
            System.out.println("Queue is full");
            return;
        }
        System.out.println("Inserted Item is : "+ val);
        arr[tail++ % (capacity)] = val;
    }
    public void remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed Item is : "+ arr[Head]);
        arr[Head++ % (capacity)] = 0;
    }

    public void show(){
        System.out.println("Queue");
        for (int i=Head;i<tail;i++){
            System.out.print(arr[i%capacity]+" ");
        }
        System.out.println();
//        System.out.println("original Array");
//        for (int i=0;i<capacity;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
    }

    public boolean isEmpty(){
        return Head == tail;
    }

    public boolean isfull(){
        return (tail-Head == capacity);
    }

}
