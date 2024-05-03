import java.util.*;

public class Graph {
    private final HashMap<Integer, HashMap<Integer, Integer>> neighbourList = new HashMap<>();

    public Graph() {}

    public void addVertex(int v) {
        neighbourList.putIfAbsent(v, new HashMap<>());
    }

    public void addEdge(int v1, int v2, int weight) {
        addVertex(v1);
        addVertex(v2);
        neighbourList.get(v1).put(v2, weight);
        neighbourList.get(v2).put(v1, weight);
    }

    public void depthFirstTraversal(int start) {
        Set<Integer> visited = new HashSet<>();
        depthrecursive(start, visited);
        System.out.println();
    }

    private void depthrecursive(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");
        for (int neighbor : neighbourList.get(vertex).keySet()) {
            if (!visited.contains(neighbor)) {
                depthrecursive(neighbor, visited);
            }
        }
    }

    public void breadthFirstTraversal(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            for (int neighbor : neighbourList.get(current).keySet()) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}