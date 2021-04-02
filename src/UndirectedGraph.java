package GraphPart2;

import java.util.ArrayList;

public class UndirectedGraph {
    public static void main(String[] args) {
        //Using list implementation method to make graph.....
        //Let Number Of Vertices Be 5
        //For competitive Programming Questions most of the time we will be given Number OF vertices
        int vertices = 5;
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            mainList.add(i,new ArrayList<Integer>());
        }
        addEdge(mainList , 0 , 1);
        addEdge(mainList , 0 , 2);
        addEdge(mainList , 0 , 4);
        addEdge(mainList , 1 , 2);
        addEdge(mainList , 2 , 3);
        addEdge(mainList , 3 , 4);
        printGraph(mainList);
    }
    /*
     0 -> 1 || 0 -> 2
     1 -> 0 || 1 -> 2
     2 -> 1 || 2 -> 0
     */
    private static void addEdge(ArrayList<ArrayList<Integer>> list,int u , int v){
        //We are doing this to make the graph undirected
        list.get(u).add(v);
        list.get(v).add(u);
    }
    private static void printGraph(ArrayList<ArrayList<Integer>> list){
        for(int i = 0 ; i < list.size() ; i++) {
            System.out.print("Value " + i + " is connected To -> ");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
