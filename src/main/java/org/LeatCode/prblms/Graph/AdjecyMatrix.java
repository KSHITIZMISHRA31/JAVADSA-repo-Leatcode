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
            int u = i[0];
            int v = i[1];
            arr.computeIfAbsent(u, k->new ArrayList<>()).add(v);
            arr.computeIfAbsent(v,k->new ArrayList<>()).add(u);
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
