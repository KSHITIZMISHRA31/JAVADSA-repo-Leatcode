package org.LeatCode.prblms.Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CreateBinaryTreeFromDescriptions {

    public static TreeNode createBinaryTree(int[][] descriptions) {

        HashMap<Integer , TreeNode> hm = new HashMap<>();
        Set<Integer> childst = new HashSet<>();
        for(int[] i : descriptions){
            int parentval = i[0];
            int childval = i[1];
            int isleft = i[2];
            hm.putIfAbsent(parentval,new TreeNode(parentval));
            hm.putIfAbsent(childval, new TreeNode(childval));

            TreeNode parent = hm.get(parentval);
            TreeNode child = hm.get(childval);

            if(isleft == 1){
                parent.left = child;
            }
            else{
                parent.right = child;
            }
            childst.add(childval);
        }
        for(int[] i: descriptions ){
            int parent = i[0];
            if(!childst.contains(parent)){
                return hm.get(parent);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] descriptions = {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        TreeNode.levelOrder(createBinaryTree(descriptions));
    }

}
