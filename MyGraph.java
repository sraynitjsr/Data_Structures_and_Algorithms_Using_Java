import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        this.adjacencyList.put(vertex, new LinkedList<>());
    }

    public void addEdge(int source, int destination) {
        this.adjacencyList.get(source).add(destination);
    }

    public void displayGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : this.adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (int neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class MyGraph {
    public static void start() {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("Graph Representation (Adjacency List) =>");
        graph.displayGraph();
    }
}
