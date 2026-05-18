package org.LeatCode.prblms.Graph;

import java.util.*;

public class BreadthFirstSearch {

    private static ArrayList bfs(int start, HashMap<Integer,ArrayList<Integer>> graph){
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(start);
        HashSet visited = new HashSet();
        ArrayList visitedpoints = new ArrayList();
        while(!qu.isEmpty()){
            Integer val = qu.poll();
            ArrayList<Integer> edges = graph.get(val);
            if(!visitedpoints.contains(val)){
                visitedpoints.add(val);
                visited.add(val);
                while(!edges.isEmpty()){
                    if(visitedpoints.contains(edges.getFirst())){
                        edges.removeFirst();
                        continue;
                    }
                    qu.offer(edges.getFirst());
                    edges.removeFirst();
                }
            }
            System.out.println(visitedpoints);
        }
        return visitedpoints;
    }

    private static void MatrixAdjencyListApproach(int[][] nodes) {

        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for(int[] i : nodes){
            int u = i[0];
            int v = i[1];

            graph.computeIfAbsent(u, k-> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k-> new ArrayList<>()).add(u);
        }

        System.out.println(graph);
        int[] res = new int[graph.size()];
        System.out.println(bfs(1,graph));
    }

    ///      1
    ///   2      6
    /// 3,4     7,9
    ///     5,8
    public static void main(String[] args) {

        int[][] nodes= {{1,2},{1,6},{2,3},{2,4},{4,5},{5,8},{6,7},{6,9},{9,8}};
        MatrixAdjencyListApproach(nodes);
    }
}
