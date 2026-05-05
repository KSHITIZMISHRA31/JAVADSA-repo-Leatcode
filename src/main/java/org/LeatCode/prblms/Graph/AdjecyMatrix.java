package org.LeatCode.prblms.Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class AdjecyMatrix {


    ///     {1}---------{2}-------{5}
    ///      |          |          |
    ///     {3}--------{4}---------

    public static void MatrixAdjencyListApproach(int[][] graph, int n, int m){
        System.out.println("----------------------Adjency List Appproach-----------------------");
        for(int i = 0;i<graph.length;i++){
            System.out.print(graph[i][0]+" "+graph[i][1]);
            System.out.println();
        }
        HashMap<Integer,ArrayList<Integer>> arr = new HashMap<>();
        for(int[] i : graph){

            if(!arr.containsKey(i[0]) && !arr.containsKey(i[1])){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(i[1]);
                arr.put(i[0],pair);
                ArrayList<Integer> pair1 = new ArrayList<>();
                pair1.add(i[0]);
                arr.put(i[1],pair1);
            }
            else if(!arr.containsKey(i[0]) && arr.containsKey(i[1])){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(i[1]);
                arr.put(i[0],pair);
                ArrayList<Integer> pair1 = arr.get(i[1]);
                pair1.add(i[0]);
                arr.put(i[1],pair1);
            }
            else if(arr.containsKey(i[0]) && !arr.containsKey(i[1])){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(i[0]);
                arr.put(i[1],pair);
                ArrayList<Integer> pair1 = arr.get(i[0]);
                pair1.add(i[1]);
                arr.put(i[0],pair1);
            }
            else{
                ArrayList<Integer> pair = arr.get(i[1]);
                pair.add(i[0]);
                arr.put(i[1],pair);
                ArrayList<Integer> pair1 = arr.get(i[0]);
                pair1.add(i[1]);
                arr.put(i[0],pair1);
            }
        }
        System.out.println(arr);

    }


    public static void MatrixApproach(int[][] graph, int n, int m){
        int[][] mat = new int[n+1][m+1];
        System.out.println("----------------------Adjency Matrix Appproach-----------------------");
        for(int i = 0;i<graph.length;i++){
            System.out.print(graph[i][0]+" "+graph[i][1]);
            mat[graph[i][0]][graph[i][1]] = 1;
            mat[graph[i][1]][graph[i][0]] = 1;
            System.out.println();
        }
        for(int i = 0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 5; //Nodes
        int m = 6; //Edges

        int[][] nodes= {{1,2},{1,3},{2,4},{2,5},{3,4},{4,5}};
        MatrixApproach(nodes,n,m);
        MatrixAdjencyListApproach(nodes,n,m);
    }
}
