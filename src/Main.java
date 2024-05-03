public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();


        graph.addEdge(1, 2, 7);
        graph.addEdge(2, 3, 3);
        graph.addEdge(2, 4, 2);
        graph.addEdge(3, 5, 5);
        graph.addEdge(3, 6, 8);
        graph.addEdge(4, 7, 3);
        graph.addEdge(7, 8, 4);
        /*graph.addEdge(6, 1, 8);
        graph.addEdge(7, 3, 10);
        graph.addEdge(8, 6, 7);
        graph.addEdge(9, 2, 6);
        graph.addEdge(10, 3, 2);
        graph.addEdge(11, 8, 6);
        graph.addEdge(12, 1, 9);
        graph.addEdge(13, 7, 3);*/

        System.out.println("Tiefensuche:");
        graph.depthFirstTraversal(1);

        System.out.println("Breitensuche");
        graph.breadthFirstTraversal(2);
    }
}