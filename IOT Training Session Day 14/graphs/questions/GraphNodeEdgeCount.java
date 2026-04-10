package DSA.nonlinear.graphs.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// count the number of nodes and edges of an undirected graph
public class GraphNodeEdgeCount {
    public static int countNodes(List<List<Integer>> adjList){
        return adjList.size();
    }
    public static int countEdges(List<List<Integer>> adjList){
        int edges=0;
        for(List<Integer> neighbour : adjList){
            edges+=neighbour.size();
        }
        // since it is an undirected graph edges are counted twice so we divide it by 2
        return edges / 2;
    }
    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        // manually adding the adjacency list representation
        adjList.add(Arrays.asList(1,2)); // node 0,s=2
adjList.add(Arrays.asList(0,2,3)); // node 1, s=3
adjList.add(Arrays.asList(0,1,4)); // n0de 2, s=3
adjList.add(Arrays.asList(1,4)); // node 3, s=2
adjList.add(Arrays.asList(2,3)); // node 4, s=2
        int nodes=countNodes(adjList);
        System.out.println("Number of nodes "+ nodes);
        int edges=countEdges(adjList);
        System.out.println("Number of edges "+ edges);
    }
}
