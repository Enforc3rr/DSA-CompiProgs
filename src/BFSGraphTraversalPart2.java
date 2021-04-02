package GraphPart2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraphTraversalPart2 {
    public static void main(String[] args) {
        int vertices = 6 ;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(i , new ArrayList<Integer>());
        }
        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,2);
        addEdge(graph,3,4);
        addEdge(graph,3,5);
        addEdge(graph,4,5);
        disconnectedGraph(graph,vertices);

    }
    private static void addEdge(ArrayList<ArrayList<Integer>> connection , int u , int v){
        connection.get(u).add(v);
        connection.get(v).add(u);
    }
    private static void disconnectedGraph(ArrayList<ArrayList<Integer>> graph , int vertices){
        boolean[] visited = new boolean[vertices+1];
        for(int i = 0 ; i < vertices ; i++){
            if(!visited[i]){
                bfsGraphTraversal(graph,visited,i);
            }
        }
    }
    private static void bfsGraphTraversal(ArrayList<ArrayList<Integer>> graph,boolean[] visited , int source){
        Queue<Integer> queue = new LinkedList<>();
        visited[source]=true;
        queue.add(source);
        while (!queue.isEmpty()){
            int takenOut = queue.poll();
            System.out.print(takenOut + " ");
            for(int attachedToTakenOut : graph.get(takenOut)){
                if(!visited[attachedToTakenOut]){
                    visited[attachedToTakenOut]=true;
                    queue.add(attachedToTakenOut);
                }
            }
        }
    }
}
