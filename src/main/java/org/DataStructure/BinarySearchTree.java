package org.DataStructure;

import com.sun.source.tree.Tree;

class TreeNode{
     int data;
     TreeNode rNode;
     TreeNode lNode;

     TreeNode(int val){
         this.data = val;
     }
 }


public class BinarySearchTree {

    TreeNode root;

    public TreeNode insertRec(TreeNode root,int val){
        if(root==null){
            root = new TreeNode(val);
        }
        else if (val > root.data) {
            root.lNode = insertRec(root.lNode,val);
        }
        else{
            root.rNode = insertRec(root.rNode,val);
        }
        return root;
    }
    public void insert(int val){
        System.out.println("Inserted item : " + val);
        root = insertRec(root,val);
    }

    //In this format we can see all elements in sorted order
    public void inOrder(){
        System.out.println("Inorder Traversal");
        inOrderTraversal(root);
        System.out.println();
    }
    public void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.rNode);
            System.out.print(root.data + " ");
            inOrderTraversal(root.lNode);

        }
    }

    //it is the order in which we inserted in tree
    public void preOrder(){
        System.out.println("Preorder Traversal");
        preOrderTraversal(root);
        System.out.println();
    }
    public void preOrderTraversal(TreeNode root){
        if(root != null){
            System.out.print(root.data + " ");
            inOrderTraversal(root.rNode);
            inOrderTraversal(root.lNode);

        }
    }

    public void postOrder(){
        System.out.println("Post order Traversal");
        postOrderTraversal(root);
        System.out.println();
    }
    public void postOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.rNode);
            inOrderTraversal(root.lNode);
            System.out.print(root.data + " ");
        }
    }


}
