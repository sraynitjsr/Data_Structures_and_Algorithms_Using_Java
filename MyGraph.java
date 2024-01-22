import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjacencyList;
    private int[][] adjacencyMatrix;

    public Graph(int numVertices) {
        this.adjacencyList = new HashMap<>();
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addVertex(int vertex) {
        this.adjacencyList.put(vertex, new LinkedList<>());
    }

    public void addEdge(int source, int destination) {
        this.adjacencyList.get(source).add(destination);
        this.adjacencyList.get(destination).add(source); // for undirected graph

        this.adjacencyMatrix[source][destination] = 1;
        this.adjacencyMatrix[destination][source] = 1; // for undirected graph
    }

    public void displayGraph() {
        System.out.println("Adjacency List Representation:");
        for (Map.Entry<Integer, List<Integer>> entry : this.adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (int neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        System.out.println("\nAdjacency Matrix Representation:");
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MyGraph {
    public static void start() {
        int numVertices = 5;
        Graph graph = new Graph(numVertices);

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println("Graph Representation =>");
        graph.displayGraph();
    }
}
