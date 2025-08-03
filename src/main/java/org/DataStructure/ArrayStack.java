package org.DataStructure;

public class ArrayStack {
    int capacity=4;
    int[] arr = new int[capacity];
    int top;

    ArrayStack(){
        top = 0;
    }

    public void extension(){
        capacity = capacity * 2;
        int[] newarr = new int[capacity];
        if (top >= 0) System.arraycopy(arr, 0, newarr, 0, top);
        arr = newarr;
    }

    public void push(int val){
        if(top == capacity){
            extension();
        }
        System.out.println("Item inserted in stack is :"+val);
        arr[top] = val;
        top++;

    }

    public void reduction(){
        capacity = (int)(capacity/2);
        int[] newarr = new int[capacity];
        if (top >= 0)
            System.arraycopy(arr, 0, newarr, 0, top);
        arr = newarr;
    }

    public void pop(){
        if(top == 0){
            System.out.println("Stack is Empty");
        }

        else{
            System.out.println("Item removed from stack is :"+arr[top-1]);
            arr[top-1] = 0;
            top--;
        }

        if(top < ((int)capacity/2 -1)){
            reduction();
        }
    }

    public void show(){
        for(int i = 0 ;i<capacity;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }


}
