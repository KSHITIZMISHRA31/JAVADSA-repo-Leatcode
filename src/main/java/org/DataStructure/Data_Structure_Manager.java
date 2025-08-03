package org.DataStructure;

public class Data_Structure_Manager {

    public void linkedListWrking(){
        Linked_List linklist = new Linked_List();
        linklist.insert(5);
        linklist.insert(12);
        linklist.insert(6);
        linklist.insert(13);
        linklist.show();
        linklist.remove();
        linklist.show();
        linklist.insert(6);
        linklist.insert(13);
        linklist.insertatloc(10,9);
        linklist.show();
        linklist.insert(12);
        linklist.insert(6);
        linklist.insert(13);
        linklist.show();
        linklist.remove();
        linklist.show();
        linklist.deleteloc(1);
        linklist.show();
        linklist.deleteloc(3);
        linklist.show();
        linklist.deleteloc(15);
        linklist.show();
    }

    public void LinkedStackWrking(){
        LinkedStack lstack = new LinkedStack();
        lstack.push(5);
        lstack.show();
        lstack.push(1);
        lstack.show();
        lstack.push(7);
        lstack.show();
        lstack.push(4);
        lstack.show();
        lstack.push(9);
        lstack.show();
        lstack.pop();
        lstack.show();
        lstack.pop();
        lstack.show();
        lstack.push(14);
        lstack.show();
        lstack.push(0);
        lstack.show();
    }

    public void arrayStackWrking(){
        ArrayStack lstack = new ArrayStack();
        lstack.push(5);
        lstack.show();
        lstack.push(1);
        lstack.show();
        lstack.push(7);
        lstack.show();
        lstack.push(4);
        lstack.show();
        lstack.push(9);
        lstack.show();
        lstack.push(5);
        lstack.show();
        lstack.push(1);
        lstack.show();
        lstack.push(7);
        lstack.show();
        lstack.push(4);
        lstack.show();
        lstack.pop();
        lstack.show();
        lstack.pop();
        lstack.show();
        lstack.push(14);
        lstack.show();
        lstack.push(10);
        lstack.show();
        lstack.pop();
        lstack.show();
        lstack.pop();
        lstack.show();
        lstack.pop();
        lstack.show();
        lstack.pop();
        lstack.show();
        lstack.pop();
        lstack.show();
        lstack.pop();
        lstack.show();
        lstack.pop();
        lstack.show();
        lstack.pop();
        lstack.show();
    }

    public void arrayQueueWrking(){

        ArrayQueue lQueue =  new ArrayQueue();
        lQueue.insert(5);
        lQueue.show();
        lQueue.insert(7);
        lQueue.show();
        lQueue.insert(3);
        lQueue.show();
        lQueue.insert(1);
        lQueue.show();
        lQueue.insert(6);
        lQueue.show();
        lQueue.remove();
        lQueue.show();
        lQueue.remove();
        lQueue.show();
        lQueue.insert(2);
        lQueue.show();
        lQueue.insert(11);
        lQueue.show();
        lQueue.insert(2);
        lQueue.show();
        lQueue.remove();
        lQueue.show();
        lQueue.remove();
        lQueue.show();



    }

    public void doublyLinkedListwrking(){
        DoublyLinkedList ldblylist = new DoublyLinkedList();
//        ldblylist.insertEnd(40);
//        ldblylist.showfront();
        ldblylist.insertBegning(23);
        ldblylist.showfront();
        ldblylist.insertBegning(35);
        ldblylist.showfront();
        ldblylist.insertEnd(75);
        ldblylist.showfront();
        ldblylist.insertBeforeval(100,35);
        ldblylist.showfront();
        ldblylist.insertBeforeval(101,35);
        ldblylist.showfront();
        ldblylist.showback();
        ldblylist.insertAfterval(11,75);
        ldblylist.showfront();
        ldblylist.insertAfterval(22,100);
        ldblylist.showfront();
        ldblylist.insertAfterval(23,25);
        ldblylist.showfront();
        ldblylist.showback();
        System.out.println("--------------Deletion in Doubly Linked List----------------------------");
        ldblylist.deleteBegning();
        ldblylist.showfront();
        ldblylist.deleteEnd();
        ldblylist.showfront();
        ldblylist.deleteItem(99);
        ldblylist.showfront();
        ldblylist.deleteItem(22);
        ldblylist.showfront();
        ldblylist.deleteItem(75);
        ldblylist.showfront();
        ldblylist.deleteItem(35);
        ldblylist.showfront();
        ldblylist.showback();
    }

    public void doublyLinkedListQueuewrking(){
        DoublyLinkedListQueue lDoublyLinkedListQueue = new DoublyLinkedListQueue();
        lDoublyLinkedListQueue.delete();
        lDoublyLinkedListQueue.show();
        lDoublyLinkedListQueue.insert(11);
        lDoublyLinkedListQueue.show();
        lDoublyLinkedListQueue.insert(15);
        lDoublyLinkedListQueue.show();
        lDoublyLinkedListQueue.delete();
        lDoublyLinkedListQueue.show();
        lDoublyLinkedListQueue.insert(13);
        lDoublyLinkedListQueue.show();
        lDoublyLinkedListQueue.insert(12);
        lDoublyLinkedListQueue.show();
        lDoublyLinkedListQueue.insert(20);
        lDoublyLinkedListQueue.show();
        lDoublyLinkedListQueue.delete();
        lDoublyLinkedListQueue.show();

    }

    public void BSTreeImpl(){
        BinarySearchTree bTree = new BinarySearchTree();
        bTree.insert(8);
        bTree.inOrder();
        bTree.insert(1);
        bTree.inOrder();
        bTree.insert(9);
        bTree.inOrder();
        bTree.insert(3);
        bTree.inOrder();
        bTree.insert(11);
        bTree.inOrder();
        bTree.insert(15);
        bTree.inOrder();
        bTree.preOrder();
        bTree.postOrder();



    }

}