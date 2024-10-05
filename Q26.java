import java.util.ArrayList;
import java.util.List;

public class Q26 {

    // Method to add an edge in an undirected graph
    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // DFS method to check for a cycle
    public static boolean isCyclicDFS(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true; // Mark the current node as visited

        // Visit all adjacent vertices
        for (Integer neighbor : adj.get(node)) {
            // If neighbor is not visited, recursively visit it
            if (!visited[neighbor]) {
                if (isCyclicDFS(neighbor, node, visited, adj)) {
                    return true; // Cycle found
                }
            } 
            // If neighbor is visited and is not the parent, then there's a cycle
            else if (neighbor != parent) {
                return true; // Cycle found
            }
        }
        return false; // No cycle found
    }

    // Main function to detect a cycle in an undirected graph
    public static boolean isCyclic(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V]; // Track visited nodes

        // Check each unvisited node (handles disconnected components)
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCyclicDFS(i, -1, visited, adj)) {
                    return true; // Cycle found
                }
            }
        }
        return false; // No cycle found
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
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 0);

        // Check if the graph contains a cycle
        if (isCyclic(V, adj)) {
            System.out.println("true"); // Output true if a cycle is found
        } else {
            System.out.println("false"); // Output false if no cycle is found
        }
    }
}
