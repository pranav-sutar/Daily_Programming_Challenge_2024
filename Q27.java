import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q27 {

    // Method to add an edge in an undirected graph
    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // BFS method to find the shortest path in an unweighted graph
    public static int findShortestPath(int V, List<List<Integer>> adj, int start, int end) {
        // Array to track the distance from start to each node
        int[] distance = new int[V];
        for (int i = 0; i < V; i++) {
            distance[i] = -1; // Initialize distances as -1 (indicating unvisited)
        }

        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start); // Start BFS from the starting node
        distance[start] = 0; // Distance to start node is 0

        // Perform BFS
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            // Visit all adjacent vertices
            for (int neighbor : adj.get(currentNode)) {
                // If the neighbor is not visited
                if (distance[neighbor] == -1) {
                    queue.add(neighbor);
                    // Update distance to the neighbor
                    distance[neighbor] = distance[currentNode] + 1;
                    
                    // If we reach the target node, return the distance
                    if (neighbor == end) {
                        return distance[neighbor];
                    }
                }
            }
        }

        // Return -1 if no path is found
        return -1;
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        List<List<Integer>> adj = new ArrayList<>(); // Adjacency list

        // Initialize adjacency list for each vertex
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        int start = 0; // Starting node
        int end = 4;   // Destination node

        // Find and print the shortest path
        int shortestPath = findShortestPath(V, adj, start, end);
        System.out.println(shortestPath); // Output the shortest path length
    }
}
